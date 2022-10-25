package br.com.alura.rh.model;

public enum Cargo {

	ASSISTENTE{
		@Override
		public Cargo getNextCargo(){
			return ANALISTA;
		}
	},
	ANALISTA{
		@Override
		public Cargo getNextCargo(){
			return ESPECIALISTA;
		}
	},
	ESPECIALISTA{
		@Override
		public Cargo getNextCargo(){
			return GERENTE;
		}
	},
	GERENTE{
		@Override
		public Cargo getNextCargo(){
			return GERENTE;
		}
	};

    public abstract Cargo getNextCargo();
}
