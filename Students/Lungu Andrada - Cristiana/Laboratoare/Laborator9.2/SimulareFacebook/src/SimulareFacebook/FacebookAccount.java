package SimulareFacebook;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class FacebookAccount implements Collection<FacebookAccount>{
	public String nume;
	public int varsta;
	public String adresa;
	ArrayList<FacebookAccount> prieteni= new  ArrayList<FacebookAccount>();
	
	FacebookAccount(String nume,int varsta,String adresa){
		this.nume=nume;
		this.varsta=varsta;
		this.adresa=adresa;
		//this.prieteni= null;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public String getAdresa() {
		return this.adresa;
	}
	
	public int getVarsta() {
		return this.varsta;
	}
	
	public  void afisarePrieten() {
		Iterator<FacebookAccount> i =this.prieteni.iterator();

		while(i.hasNext()) {
		System.out.println(i.next());
		}
	}
	public void adaugaPrieten(FacebookAccount prietenNou) {
		this.prieteni.add(prietenNou);
		prietenNou.prieteni.add(this);
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<FacebookAccount> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(FacebookAccount e) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends FacebookAccount> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	
	
	 public void stergePrieten (FacebookAccount prieten)
	 {
	 Iterator<FacebookAccount> it = this.prieteni.iterator ();
	 while (it.hasNext ())
	 {
		 FacebookAccount del = (FacebookAccount) it.next ();
		 if (del==prieten) it.remove ();
	 }
	 
	 Iterator<FacebookAccount> it2 =prieten.prieteni.iterator ();
	 while (it2.hasNext ())
	 {
		 FacebookAccount del2 = (FacebookAccount) it2.next ();
		 if (del2==this) it2.remove ();
	 }
	 }
	 
	 public void afisarePrieteni(FacebookAccount cont) {
			Iterator<FacebookAccount> i =cont.prieteni.iterator();

			while(i.hasNext()) {
			System.out.println(i.next().toString());
		 }
	 }
	  
	 
	 
	 public void gasestePrieten(String adresaDorita) {
		 for(FacebookAccount prt:prieteni) {
			 if (prt.adresa.equals(adresaDorita))
			 {
				 System.out.println(prt);
			 }
		 }
	 }
	 
	 
	public String toString() 
    { 
        return nume + " " + varsta + " " + adresa; 
    }
	
}
