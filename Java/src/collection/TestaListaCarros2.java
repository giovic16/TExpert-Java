package collection;

import poo.Carro;

import java.util.*;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestaListaCarros2 {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("A1","Ford","Focus", 2013));
        carros.add(new Carro("A2","Audi","Q3", 2016));
        carros.add(new Carro("A3","Mercedes","GLE 400", 2020));
        carros.add(new Carro("A4","BMW","X6", 2019));
        carros.add(new Carro("A5","Ferrari","F458", 2023));
        carros.add(new Carro("A6","Lamborghini","Urus", 2021));

//        List<Carro> carrosFiltrados = new ArrayList<>();
//        for (Carro carro : carros){
//            if (carro.getAno() >= 2020) carrosFiltrados.add(carro);  // predicado
//            carrosFiltrados.forEach(carro -> System.out.println(carro));
//        }
// tirar comentários
        Stream<Carro> streamDeCarros = carros.stream();
        streamDeCarros.forEach(carro -> System.out.println(carro));

        System.out.println("---------------------");

        Stream<Carro> streamDeCarros2 = carros.stream();
        Stream<Carro> streamDeCarrosFiltrados = streamDeCarros2.filter(carro -> carro.getAno() >= 2020); // primeira opção
        streamDeCarrosFiltrados.forEach(carro -> System.out.println(carro));

        System.out.println("---------------------");

        carros.stream().filter(carro -> carro.getAno() >= 2020).forEach(carro -> System.out.println(carro)); // segunda opção

        System.out.println("---------------------");

        List<Carro> carrosFiltrados = carros.stream()
              .filter(carro -> carro.getAno() >= 2020)
              .collect(Collectors.toList()); // terceira opção

        System.out.println("Tamanho: " + carrosFiltrados.size());
        carrosFiltrados.forEach(carro -> System.out.println(carro));

        System.out.println("---------------------");

//        List<String> marcas = new ArrayList<>();
//        // Map
//        for (Carro carro : carros) {
//            marcas.add(carro.getMarca()); //  Primeira opção
//        }
//
//        carros.stream()
//              .map(carro -> carro.getMarca())
//              .forEach(marca -> System.out.println("Marcas: " + marca)); // segunda opção

        List<String> marcas = carros.stream()
              .map(carro -> carro.getMarca())
              .collect(Collectors.toList()); // terceira opção

        marcas.forEach(marca -> System.out.println("Marcas: " + marca));

        System.out.println("---------------------");

        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Giovana", 20));
        pessoas.add(new Pessoa("Victoria", 25));
        pessoas.add(new Pessoa("Mendes", 5));
        pessoas.add(new Pessoa("Fred", 33));
        pessoas.add(new Pessoa("Alexandre", 16));

        int soma = pessoas.stream()
                .mapToInt((pessoa -> pessoa.getIdade()))
                .sum();
        System.out.println("Soma das idades: " + soma);

        OptionalDouble media = pessoas.stream()
                .mapToInt((pessoa -> pessoa.getIdade()))
                .average();
        System.out.println("Média das idades: " + media.getAsDouble());

//        Optional<Pessoa> optionalPessoa = pessoas.stream().findAny();
//        Pessoa pessoa = optionalPessoa.orElse(new Pessoa("Qualquer", 0));
//        System.out.println(pessoa.getNome()); primeira opção
//
//        if (optionalPessoa.isPresent()){
//            System.out.println(optionalPessoa.get().getNome().get());
        }
    }

