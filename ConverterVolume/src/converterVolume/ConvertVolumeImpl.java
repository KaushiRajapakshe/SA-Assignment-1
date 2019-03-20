package converterVolume;


import converterVolume.ConvertVolumeDTO;
import converterVolume.ConvertVolumeService;


public class ConvertVolumeImpl implements ConvertVolumeService{
	
		@Override
		public double LiterToMeliLiter(ConvertVolumeDTO convertVolumeDTO) {
			// TODO Auto-generated method stub
			if(convertVolumeDTO.getConTo() == 1) {
				return (convertVolumeDTO.getValueV() *1000);
			}
			return 0;
		}
		@Override
		public double MiliLiterToLiter(ConvertVolumeDTO convertVolumeDTO) {
			// TODO Auto-generated method stub
			if(convertVolumeDTO.getConTo() == 2) {
				return (convertVolumeDTO.getValueV() /1000);
			}
			return 0;
		}
		@Override
		public double LiterToGaloon(ConvertVolumeDTO convertVolumeDTO) {
			// TODO Auto-generated method stub
			if(convertVolumeDTO.getConTo() == 3) {
				return (convertVolumeDTO.getValueV() * 3.785);
			}
			return 0;
		}
		@Override
		public double GaloonToLiter(ConvertVolumeDTO convertVolumeDTO) {
			// TODO Auto-generated method stub
			if(convertVolumeDTO.getConTo() == 4) {
				return (convertVolumeDTO.getValueV() /3.785);
			}
			return 0;
		}
	}

	

