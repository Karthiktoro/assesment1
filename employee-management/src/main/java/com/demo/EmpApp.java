package com.demo;



import java.util.ArrayList;
import java.util.List;

public class EmpApp {

	public String findEmp(Integer id) throws EmpNotFoundException {
		if (EmpDb.getDb().containsKey(id)) {
			return EmpDb.getDb().get(id).getDetails();}
		else {
			throw new EmpNotFoundException() ;
		}
		}
	
	

		public String createEmp(int id, Emp e) throws EmpExistsException {
			if (EmpDb.getDb().containsKey(id)) {
				 throw new EmpExistsException();
			} else {
				EmpDb.getDb().put(id, e);
				return "data entered";
			}
		}
		
		public String deleteEmp(Integer id) {
			if (EmpDb.getDb().containsKey(id)) {
				EmpDb.getDb().remove(id);
				return "employee deleted";
			} else {
				return "Not found";
			}
			}
		
		public List<Emp> allEmp(){
			List<Emp> l = new ArrayList<Emp>();
			for(Emp item : EmpDb.getDb().values()) {
				l.add(item);
			}
			return l;	
		}
		


}
