package com.preethi.test;

public class CapitalCity {
	
		   private int id;
		   private String name;
		   private int population;
		   private String countryCode;
		   public CapitalCity() {
		   }
		   public CapitalCity(int id, String name, String countryCode, int population) {
		      this.id = id;
		      this.name = name;
		      this.countryCode = countryCode;
		      this.population = population;
		     
		   }
		   
		   public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPopulation() {
			return population;
		}

		public void setPopulation(int population) {
			this.population = population;
		}

		public String getCountryCode() {
			return countryCode;
		}

		public void setCountryCode(String countryCode) {
			this.countryCode = countryCode;
		}

		@Override   
		   public String toString() {
		      return "City [id=" + id + ", name=" + name + ", population=" + population + ", countryCode=" + countryCode + "]";
		   };

		

}
