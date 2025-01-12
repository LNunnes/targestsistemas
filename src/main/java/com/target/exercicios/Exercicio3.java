package com.target.exercicios;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.target.dto.DadosDTO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Exercicio3 {

    public static void main(String[] args) {
        try {
            String caminhoArquivo = "C:/Users/Lucas/Desktop/Estudos/targetsistemas/src/main/java/com/target/data/dados.json";

            BufferedReader reader = new BufferedReader(new FileReader(caminhoArquivo));
            Gson gson = new Gson();

            Type listType = new TypeToken<ArrayList<DadosDTO>>() {}.getType();
            List<DadosDTO> dados = gson.fromJson(reader, listType);
            reader.close();

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0;
            int diasComFaturamento = 0;

            for (DadosDTO dia : dados) {
                if (dia.valor() > 0) {
                    if (dia.valor() < menorFaturamento) {
                        menorFaturamento = dia.valor();
                    }
                    if (dia.valor() > maiorFaturamento) {
                        maiorFaturamento = dia.valor();
                    }
                    somaFaturamento += dia.valor();
                    diasComFaturamento++;
                }
            }

            double mediaMensal = somaFaturamento / diasComFaturamento;

            int diasAcimaDaMedia = 0;
            for (DadosDTO dia : dados) {
                if (dia.valor() > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor faturamento: " + menorFaturamento);
            System.out.println("Maior faturamento: " + maiorFaturamento);
            System.out.println("Dias acima da média mensal: " + diasAcimaDaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
