package convertervolume;

public interface ConvertVolumeService {
	public double LiterToMeliLiter(ConvertVolumeDTO convertVolumeDTO);
	public double MiliLiterToLiter(ConvertVolumeDTO convertVolumeDTO);
	public double LiterToGaloon(ConvertVolumeDTO convertVolumeDTO);
	public double GaloonToLiter(ConvertVolumeDTO convertVolumeDTO);

}
