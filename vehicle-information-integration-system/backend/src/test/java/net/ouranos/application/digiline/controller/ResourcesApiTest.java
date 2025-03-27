package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Size;
import net.ouranos.domain.digiline.model.Resources;
import net.ouranos.domain.digiline.model.Voxel;

/**
 * Unit tests for the {@link ResourcesApi} class.
 */
public class ResourcesApiTest {

    private ResourcesApi resourcesApi = new ResourcesApi() {

        @Override
        public ResponseEntity<Void> resourcesDelete(UUID xTracking,
                @Size(min = 4, max = 4) @Valid List<@DecimalMin(value = "-180", inclusive = true) @DecimalMax(value = "180", inclusive = true) Double> bbox,
                @Valid Voxel voxel, @DecimalMin("-2147483648") @DecimalMax("2147483647") @Valid BigDecimal mesh,
                @DecimalMin("-2147483648") @DecimalMax("2147483647") @Valid BigDecimal city, @Valid String roadName,
                @Valid String category, @Size(min = 0, max = 4096) @Valid String keyFilter,
                @DecimalMin("-2147483648") @DecimalMax("2147483647") @Valid BigDecimal lowerBound,
                @DecimalMin("-2147483648") @DecimalMax("2147483647") @Valid BigDecimal upperBound) {
            throw new UnsupportedOperationException("Unimplemented method 'partsDelete'");
        }

        @Override
        public ResponseEntity<Object> resourcesPut(UUID xTracking, @Valid Resources resources) {
            throw new UnsupportedOperationException("Unimplemented method 'partsPut'");
        }
        
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = resourcesApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}