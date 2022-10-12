package collection;

import java.util.ArrayList;

public class TrainDAO {

		ArrayList details = new ArrayList();
		public String save (TrainDTO dto) {
			details.add(dto);
			return dto.getName()+"saved data";
			
		}
		public ArrayList getByName(String name) {
			ArrayList al = new ArrayList();
			for (int i=0; i<details.size(); i++) {
				TrainDTO dto= (TrainDTO)details.get(i);
				if (dto.getname().equals(name)) {
					al.add(dto);
				}
			}
			return al;
		}
		
		public ArrayList removeByName(String name) {
			ArrayList ar = new ArrayList();
			for (int i=0; i<details.size(); i++) {
				TrainDTO dto= (TrainDTO)details.get(i);
				if (dto.getname().equals(name)) {
					details.remove(dto);
				}
			}
			return ar;
		}	
		public ArrayList getByorigin(String origin) {
			for (int i=0; i<details.size(); i++) {
				TrainDTO dto= (TrainDTO)details.get(i);
				if (dto.getorigin().equals(origin)) {
					details.add(dto);
				}
			}
			return details;
		}
		public ArrayList getAll() {
			return details;
		}

}