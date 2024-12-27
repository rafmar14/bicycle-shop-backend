package com.example.bicycleshop;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
public abstract class AbstractCrudTest<T> {

    @Autowired
    protected MockMvc mockMvc;

    protected ObjectMapper objectMapper = JsonMapper.builder()
            .addModule(new JavaTimeModule())
            .build();

    protected abstract String getBaseUrl();

    protected abstract T createEntity();

    protected abstract T updateEntity(T entity);

    @Transactional
    protected ResultActions createEntityTest(T entity) throws Exception {
        return mockMvc.perform(post(getBaseUrl())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(entity)))
                .andExpect(status().isCreated());
    }

    @Transactional
    protected void readEntityTest(Long id) throws Exception {
        mockMvc.perform(get(getBaseUrl() + "/{id}", id))
                .andExpect(status().isOk());
    }

    @Transactional
    protected void readEntityTestNotFound(Long id) throws Exception {
        mockMvc.perform(get(getBaseUrl() + "/{id}", id))
                .andExpect(status().isNotFound());
    }

    @Transactional
    protected void updateEntityTest(T entity) throws Exception {
        mockMvc.perform(put(getBaseUrl())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(entity)))
                .andExpect(status().isOk());
    }

    @Transactional
    protected void deleteEntityTest(long id) throws Exception {
        mockMvc.perform(delete(getBaseUrl() + "/{id}", id)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNoContent());
    }

    @Test
    public void testCrudOperations() throws Exception {
        T entity = createEntity();
        ResultActions createResult = createEntityTest(entity);
        Long entityId = 1L;

        readEntityTest(entityId);

        T updatedEntity = updateEntity(entity);
        updateEntityTest(updatedEntity);

        readEntityTest(entityId);

        deleteEntityTest(entityId);
        readEntityTestNotFound(entityId);
    }
}
