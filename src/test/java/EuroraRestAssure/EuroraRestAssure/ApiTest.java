package EuroraRestAssure.EuroraRestAssure;

import static org.junit.Assert.assertEquals;

import EuroraRestAssure.EntityUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.requestDTO.RequestDTO;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

public class ApiTest {
	String token = "ckCi8JagStC6ruNeSWY2kQCpIl5rfl6T";

	/**
	 * Creates a response with token
	 * @param	token  Key for authorization
	 * @param 	requestDTO contain JSON for request
	 * @return 	request
	 * */
	public Response sendRequest(String token, List<RequestDTO> requestDTO) throws JsonProcessingException {
		String body = (new ObjectMapper()).writeValueAsString(requestDTO);
		return RestAssured.given()
				.header("X-Auth-Token", token)
				.contentType(ContentType.JSON).body(body).post();
}

	@Before
	public void setup() {
		RestAssured.baseURI = "https://api.integration.eurora.com/customs-calculator/v1/shopping-cart";
	}

	@Test
	//Positive test all data filled in server code 200
	public void test_200() throws JsonProcessingException {
		List<RequestDTO> requestDTO = List.of(EntityUtils.createRequestDTO());
		Response http_req = sendRequest(token, requestDTO);
		assertThat(http_req.getStatusCode()).isEqualTo(200);
	}

	@Ignore
	@Test
	//TODO: PSEUDOCODE, FIX IT
	//Negative tests without filling in required fields
	public void test_400() throws JsonProcessingException {
		List<RequestDTO> requestDTO = List.of(EntityUtils.createRequestDTO());
		//requestDTO.setExternalId(null);
		Response http_req = sendRequest(token, requestDTO);
		assertThat(http_req.getStatusCode()).isEqualTo(400);
	}
}
