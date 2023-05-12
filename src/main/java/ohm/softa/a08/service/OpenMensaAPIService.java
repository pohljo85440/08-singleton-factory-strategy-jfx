package ohm.softa.a08.service;

import ohm.softa.a08.api.OpenMensaAPI;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class OpenMensaAPIService {
	private static final OpenMensaAPIService instance = new OpenMensaAPIService();
	private final OpenMensaAPI instanceOpenMensaAPI;

	private OpenMensaAPIService() {
		Retrofit retrofit = new Retrofit.Builder()
			.addConverterFactory(GsonConverterFactory.create())
			.baseUrl("https://openmensa.org/api/v2/")
			.build();

		instanceOpenMensaAPI = retrofit.create(OpenMensaAPI.class);
	}

	public static OpenMensaAPIService getInstance() {
		return instance;
	}

	public OpenMensaAPI getApi() {
		return instanceOpenMensaAPI;
	}
}
