package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Paciente;

public class PacienteDAO {

	private File arq;

	public PacienteDAO() {
		arq = new File("resources\\arquivos\\pacientes.txt");
	}

	public boolean gravaPaciente(Paciente p) {
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(arq);
			bw = new BufferedWriter(fw);

			bw.write(p.toString());
			bw.newLine();
			bw.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}

		finally {
			try {
				fw.close();
				bw.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
	}

	public boolean lePaciente(Paciente p) {
		if (arq.exists()) {

			FileReader fr = null;
			BufferedReader br = null;

			try {
				fr = new FileReader(arq);
				br = new BufferedReader(fr);

				String linha = null;
				String[] campos = new String[4];
				
				while((linha=br.readLine())!=null) {
					campos = linha.split("#");
					if(campos[0] == p.getCpf()) {
						p.setNome(campos[1]);
						p.setIdade(Integer.parseInt(campos[2]));
						p.setEndereco(campos[3]);
						break;
					}
				}
				

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			return true;
		}
		else {
			return false;
		}

	}
}
