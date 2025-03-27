package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import jakarta.validation.Valid;
import net.ouranos.domain.digiline.model.TrspAbilityLineItem;

/**
 * Unit tests for the {@link TrspAbilityLineItemApi} class.
 */
public class TrspAbilityLineItemApiTest {

    private TrspAbilityLineItemApi trspAbilityLineItemApi = new TrspAbilityLineItemApi() {

        @Override
        public ResponseEntity<Object> trspAbilityLineItemPut(UUID xTracking, @Valid TrspAbilityLineItem trspAbilityLineItem) {
            throw new UnsupportedOperationException("Unimplemented method 'trspAbilityLineItemPut'");
        }
        
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = trspAbilityLineItemApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
