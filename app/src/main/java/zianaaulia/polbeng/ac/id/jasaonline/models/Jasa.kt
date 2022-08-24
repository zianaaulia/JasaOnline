package zianaaulia.polbeng.ac.id.jasaonline.models

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Jasa(
    @SerializedName("id_jasa")
    val idJasa: Int,
    @SerializedName("nama_penyedia")
    val namaPenyedia: String,
    @SerializedName("nomor_hp")
    val nomorHP: String,
    @SerializedName("nama_jasa")
    val namaJasa: String,
    @SerializedName("deskripsi_singkat")
    val deskripsiSingkat: String,
    @SerializedName("uraian_deskripsi")
    val uraianDeskripsi: String,
    @SerializedName("rating")
    val rating: Int,
    @SerializedName("gambar")
    val gambar: String
):Serializable
