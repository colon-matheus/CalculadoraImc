package control;


public class CalculadoraImc {
	public String classificaImcMeninos(Pessoa pessoa, double imc) {
		
		String classificador = "IMC não classificado";
		System.out.println("Caiu no classificaImcMeninos");

		if (pessoa.sexo.compareTo("Masculino") == 0) {

			if (pessoa.idade <= 2) {

				if (imc < 15)
					classificador = "Baixo peso";

				else if (imc <= 18)
					classificador = "Peso normal";

				else if (imc <= 21)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (pessoa.idade <= 4) {

				if (imc < 14)
					classificador = "Baixo peso";

				else if (imc <= 17)
					classificador = "Peso normal";

				else if (imc <= 18)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (pessoa.idade <= 6) {

				if (imc < 14)
					classificador = "Baixo peso";

				else if (imc <= 17)
					classificador = "Peso normal";

				else if (imc <= 18.3)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (pessoa.idade <= 8) {

				if (imc < 14)
					classificador = "Baixo peso";

				else if (imc <= 18)
					classificador = "Peso normal";

				else if (imc <= 20)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (pessoa.idade <= 10) {

				if (imc < 14.5)
					classificador = "Baixo peso";

				else if (imc <= 19)
					classificador = "Peso normal";

				else if (imc <= 22)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (pessoa.idade <= 12) {

				if (imc < 15.2)
					classificador = "Baixo peso";

				else if (imc <= 21)
					classificador = "Peso normal";

				else if (imc <= 23)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (pessoa.idade <= 14) {

				if (imc < 16.3)
					classificador = "Baixo peso";

				else if (imc <= 22.5)
					classificador = "Peso normal";

				else if (imc <= 26)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (pessoa.idade <= 16) {

				if (imc < 16.8)
					classificador = "Baixo peso";

				else if (imc <= 24)
					classificador = "Peso normal";

				else if (imc <= 26.5)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (pessoa.idade <= 18) {

				if (imc < 18.9)
					classificador = "Baixo peso";

				else if (imc <= 25.7)
					classificador = "Peso normal";

				else if (imc <= 27.9)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			else {

				if (imc < 18.9)
					classificador = "Baixo peso";

				else if (imc <= 25.7)
					classificador = "Peso normal";

				else if (imc <= 27.9)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			return classificador;

		}

		else
			return classificaImcMeninas(pessoa, imc);

	}

	public String classificaImcMeninas(Pessoa pessoa, double imc) {

		String classificador = "IMC não classificado";
		System.out.println("Caiu no classificaImcMeninas");
		
		if (pessoa.gravida == true)
			return classificaImcMulherGravida(pessoa, imc);

		if (pessoa.sexo.compareTo("Feminino") == 0) {

			if (pessoa.idade <= 2) {

				if (imc < 15)
					classificador = "Baixo peso";

				else if (imc <= 18)
					classificador = "Peso normal";

				else if (imc <= 20)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (pessoa.idade <= 4) {

				if (imc < 14)
					classificador = "Baixo peso";

				else if (imc <= 17)
					classificador = "Peso normal";

				else if (imc <= 18)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (pessoa.idade <= 6) {

				if (imc < 14)
					classificador = "Baixo peso";

				else if (imc <= 17)
					classificador = "Peso normal";

				else if (imc <= 19)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (pessoa.idade <= 8) {

				if (imc < 14)
					classificador = "Baixo peso";

				else if (imc <= 18)
					classificador = "Peso normal";

				else if (imc <= 20.7)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (pessoa.idade <= 10) {

				if (imc < 14.5)
					classificador = "Baixo peso";

				else if (imc <= 20)
					classificador = "Peso normal";

				else if (imc <= 23)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (pessoa.idade <= 12) {

				if (imc < 15.5)
					classificador = "Baixo peso";

				else if (imc <= 21.8)
					classificador = "Peso normal";

				else if (imc <= 25)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (pessoa.idade <= 14) {

				if (imc < 16.3)
					classificador = "Baixo peso";

				else if (imc <= 23.2)
					classificador = "Peso normal";

				else if (imc <= 27)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (pessoa.idade <= 16) {

				if (imc < 17.2)
					classificador = "Baixo peso";

				else if (imc <= 24.7)
					classificador = "Peso normal";

				else if (imc <= 29)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			if (pessoa.idade <= 18) {

				if (imc < 18.2)
					classificador = "Baixo peso";

				else if (imc <= 25.7)
					classificador = "Peso normal";

				else if (imc <= 30.2)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			else {

				if (imc < 18.5)
					classificador = "Baixo peso";

				else if (imc <= 26.5)
					classificador = "Peso normal";

				else if (imc <= 32.7)
					classificador = "Sobrepeso";

				else
					classificador = "Obesidade";

			}

			return classificador;
		}

		return classificaImcMeninos(pessoa, imc);

	}

	public String classificaImcHomensIdosos(Pessoa pessoa, double imc) {

		String classificador = "IMC não classificado";
		System.out.println("Caiu no classificaImcHomensIdosos");

		if (pessoa.sexo.compareTo("Masculino") == 0) {

			if (pessoa.idade > 65) {

				if (imc < 21.9)
					classificador = "Baixo peso";
				else if (imc <= 27)
					classificador = "Peso normal";
				else if (imc <= 30)
					classificador = "Sobrepeso";
				else if (imc <= 35)
					classificador = "Obesidade grau I";
				else if (imc <= 39.9)
					classificador = "Obesidade grau II";
				else
					classificador = "Obesidade grau III (Obesidade mórbida)";

			}

			else if (pessoa.idade <= 20)
				return classificaImcMeninos(pessoa, imc);
			else
				return classificaImcGeral(pessoa);

		}

		return classificador;

	}

	public String classificaImcMulheresIdosas(Pessoa pessoa, double imc) {

		String classificador = "IMC não classificado";
		System.out.println("Caiu no classificaImcMulheresIdosas");

		if (pessoa.gravida == true)
			return classificaImcMulherGravida(pessoa, imc);
			
		if (pessoa.sexo.compareTo("Feminino") == 0) {

			if (pessoa.idade > 65) {

				if (imc < 21.9)
					classificador = "Baixo peso";
				else if (imc <= 27)
					classificador = "Peso normal";
				else if (imc <= 32)
					classificador = "Sobrepeso";
				else if (imc <= 37)
					classificador = "Obesidade grau I";
				else if (imc <= 41.9)
					classificador = "Obesidade grau II";
				else
					classificador = "Obesidade grau III (Obesidade mórbida)";

			}

			else if (pessoa.idade <= 20)
				return classificaImcMeninas(pessoa, imc);
			else
				return classificaImcGeral(pessoa);
		}

		return classificador;
	}

	public String classificaImcMulherGravida(Pessoa pessoa, double imc) {

		String classificador = "IMC não classificado";
		System.out.println("Caiu no classificaImcMulherGravida");

		if (pessoa.sexo.compareTo("Feminino") == 0) {

			if (pessoa.gravida == true) {

				if (imc < 18.5)
					classificador = "Baixo peso";
				else if (imc <= 24.9)
					classificador = "Peso normal";
				else if (imc <= 29.9)
					classificador = "Sobrepeso";
				else
					classificador = "Obesidade";
			}

			else
				return classificaImcGeral(pessoa);
		}

		return classificador;
	}

	public double classificaImcGeral(Pessoa pessoa) {
		double imc = pessoa.peso / (Math.pow(pessoa.altura, 2));
		return imc;
	}


}
