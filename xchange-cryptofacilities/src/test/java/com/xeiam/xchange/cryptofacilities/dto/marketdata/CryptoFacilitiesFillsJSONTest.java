package com.xeiam.xchange.cryptofacilities.dto.marketdata;

import static org.fest.assertions.api.Assertions.assertThat;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Panchen
 */

public class CryptoFacilitiesFillsJSONTest {

	@Test
	public void testUnmarshal() throws IOException {

	    // Read in the JSON from the example resources
	    InputStream is = CryptoFacilitiesFillsJSONTest.class.getResourceAsStream("/marketdata/example-fills-data.json");

	    // Use Jackson to parse it
	    ObjectMapper mapper = new ObjectMapper();
	    CryptoFacilitiesFills cryptoFacilitiesFills = mapper.readValue(is, CryptoFacilitiesFills.class);
	    
	    // Verify that the example data was unmarshalled correctly
	    assertThat(cryptoFacilitiesFills.isSuccess()).isTrue();
	    
	    List<CryptoFacilitiesFill> fills = cryptoFacilitiesFills.getFills();
	    
	    assertThat(fills.size()).isEqualTo(2);
	    
	    Iterator<CryptoFacilitiesFill> it = fills.iterator();
	    CryptoFacilitiesFill fill = it.next();
	    
	    assertThat(fill.getOrderId()).isEqualTo("c18f0c17-9971-40e6-8e5b-10df05d422f0");
	    assertThat(fill.getFillId()).isEqualTo("522d4e08-96e7-4b44-9694-bfaea8fe215e");
            assertThat(fill.getSymbol()).isEqualTo("f-xbt:usd-sep16");	    
	    assertThat(fill.getSide()).isEqualTo("buy");
	    assertThat(fill.getSize()).isEqualTo(new BigDecimal("2"));	    
	    assertThat(fill.getPrice()).isEqualTo(new BigDecimal("425.5"));
	  }


}
