package zianaaulia.polbeng.ac.id.jasaonline.services

import retrofit2.Call
import retrofit2.http.GET
import zianaaulia.polbeng.ac.id.jasaonline.models.JasaResponse

interface JasaService {
    @GET("services")
    fun getJasa() : Call<JasaResponse>
}