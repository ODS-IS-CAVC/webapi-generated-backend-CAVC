package net.ouranos.application.digiline.controller;

import static org.junit.jupiter.api.Assertions.assertFalse;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import net.ouranos.domain.digiline.model.CarrierTransRequest;

/**
 * Unit tests for the {@link CarrierTransRequestApi} class.
 */
public class CarrierTransRequestApiTest {

    private CarrierTransRequestApi CarrierTransRequestApi = new CarrierTransRequestApi() {

        @Override
        public ResponseEntity<Object> carrierTransRequestGet(UUID xTracking,String serviceNo,String serviceName,BigDecimal carMaxLoadCapacity1Meas,String trspOpStrtAreaLineOneTxt,String trspOpEndAreaLineOneTxt,String maxTrspOpDateTrmStrtDate,String minTrspOpDateTrmStrtDate,String maxTrspOpDateTrmEndDate,String minTrspOpDateTrmEndDate,String maxTrspOpPlanDateTrmStrtTime,String minTrspOpPlanDateTrmStrtTime,String maxTrspOpPlanDateTrmEndTime,String minTrspOpPlanDateTrmEndTime){
            throw new UnsupportedOperationException("Unimplemented method 'carrierTransRequestGet'");
        }
        @Override
        public ResponseEntity<Void> carrierTransRequestPut(UUID xTracking,  CarrierTransRequest CarrierTransRequest) {
            throw new UnsupportedOperationException("Unimplemented method 'carrierTransRequestPut'");
        }
        
        @Override
        public ResponseEntity<Void> carrierTransRequestDelete(UUID xTracking,
        String trspInstructionId,
        String serviceNo,
        String serviceStrtDate,
        String cnsgPrtyHeadOffId,
        String cnsgPrtyBrncOffId,
        String trspRqrPrtyHeadOffId,
        String trspRqrPrtyBrncOffId) {
            throw new UnsupportedOperationException("Unimplemented method 'carrierTransRequestDelete'");
        }
    };

    /**
        * test getRequest method.
    */
    @Test
    public void testGetRequest() {
        // Act
        Optional<NativeWebRequest> response = CarrierTransRequestApi.getRequest();

        // Assert
        assertFalse(response.isPresent());
    }
}
