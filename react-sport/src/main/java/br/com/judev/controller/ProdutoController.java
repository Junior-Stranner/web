package br.com.judev.controller;

import br.com.judev.model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController {

    private final List<Produto> produtos = new ArrayList<>();

    public void carregarProdutos() {
        if (!produtos.isEmpty()) {
            return;
        }
        // Premier League
        produtos.add(new Produto("P001", "Camisa Manchester United ", "Camisa oficial da temporada 2023/24", 149.90, 120, "Premier League"));
        produtos.add(new Produto("P002", "Camisa Arsenal ", "Camisa vermelha e branca com detalhes dourados", 159.90, 95, "Premier League"));
        produtos.add(new Produto("P003", "Camisa Liverpool ", "Camisa vermelha tradicional do Liverpool", 169.90, 110, "Premier League"));
        produtos.add(new Produto("P004", "Camisa Manchester City ", "Camisa azul clara com detalhes brancos", 149.90, 85, "Premier League"));
        produtos.add(new Produto("P005", "Camisa Chelsea ", "Camisa azul com design moderno", 139.90, 75, "Premier League"));
        produtos.add(new Produto("P006", "Camisa Tottenham ", "Camisa branca tradicional com detalhes azuis", 169.90, 65, "Premier League"));
        produtos.add(new Produto("P007", "Camisa Newcastle ", "Camisa listrada em preto e branco", 159.90, 80, "Premier League"));
        produtos.add(new Produto("P008", "Camisa Aston Villa ", "Camisa vinho com azul", 179.90, 60, "Premier League"));
        produtos.add(new Produto("P009", "Camisa Leeds United ", "Camisa branca com detalhes dourados", 199.90, 55, "Premier League"));
        produtos.add(new Produto("P010", "Camisa West Ham ", "Camisa vinho com azul claro", 199.90, 70, "Premier League"));

        // La Liga
        produtos.add(new Produto("L001", "Camisa Real Madrid ", "Camisa branca com detalhes dourados", 149.90, 150, "La Liga"));
        produtos.add(new Produto("L002", "Camisa Barcelona ", "Camisa azul e grená", 159.90, 140, "La Liga"));
        produtos.add(new Produto("L003", "Camisa Atlético de Madrid ", "Camisa listrada em vermelho e branco", 199.90, 100, "La Liga"));
        produtos.add(new Produto("L004", "Camisa Sevilla ", "Camisa branca tradicional", 169.90, 80, "La Liga"));
        produtos.add(new Produto("L005", "Camisa Real Betis", "Camisa verde e branca", 149.90, 75, "La Liga"));
        produtos.add(new Produto("L006", "Camisa Real Sociedad ", "Camisa azul e branca", 139.90, 65, "La Liga"));
        produtos.add(new Produto("L007", "Camisa Villarreal ", "Camisa amarela", 169.90, 60, "La Liga"));
        produtos.add(new Produto("L008", "Camisa Valencia ", "Camisa branca com preto", 159.90, 70, "La Liga"));
        produtos.add(new Produto("L009", "Camisa Mallorca ", "Camisa vermelha com preto", 169.90, 50, "La Liga"));
        produtos.add(new Produto("L010", "Camisa Celta de Vigo ", "Camisa azul clara", 199.90, 55, "La Liga"));

        // Seleções
        produtos.add(new Produto("S001", "Camisa Brasil ", "Camisa amarela tradicional da seleção brasileira", 149.90, 200, "Seleções"));
        produtos.add(new Produto("S002", "Camisa Argentina ", "Camisa azul e branca da campeã mundial", 169.90, 180, "Seleções"));
        produtos.add(new Produto("S003", "Camisa França ", "Camisa azul da seleção francesa", 199.90, 160, "Seleções"));
        produtos.add(new Produto("S004", "Camisa Alemanha ", "Camisa branca com preto", 179.90, 150, "Seleções"));
        produtos.add(new Produto("S005", "Camisa Espanha ", "Camisa vermelha tradicional", 149.90, 140, "Seleções"));
        produtos.add(new Produto("S006", "Camisa Japão ", "Camisa branca com azul escuro", 159.90, 130, "Seleções"));
        produtos.add(new Produto("S007", "Camisa Itália ", "Camisa azul da Azzurra", 169.90, 120, "Seleções"));
        produtos.add(new Produto("S008", "Camisa Portugal ", "Camisa vermelha com verde", 159.90, 110, "Seleções"));
        produtos.add(new Produto("S009", "Camisa Holanda ", "Camisa laranja vibrante", 199.90, 100, "Seleções"));
        produtos.add(new Produto("S010", "Camisa Jamaica ", "Camisa azul clara com detalhes pretos", 139.90, 90, "Seleções"));
    }

    public synchronized boolean baixarEstoque(String codigo, int quantidade) {
        Produto produto = buscarPorCodigo(codigo);
        if (produto == null) {
            System.out.println("Produto não encontrado para o código: " + codigo);
            return false;
        }

        if (quantidade <= 0) {
            System.out.println("Quantidade inválida: " + quantidade);
            return false;
        }

        int estoqueAtual = produto.getEstoque();
        if (estoqueAtual < quantidade) {
            System.out.println("Estoque insuficiente. Estoque atual: " + estoqueAtual + ", solicitado: " + quantidade);
            return false;
        }

        produto.setEstoque(estoqueAtual - quantidade);
        System.out.println("Estoque atualizado para o produto " + produto.getNome() +
                ". Antes: " + estoqueAtual + ", depois: " + produto.getEstoque());
        return true;
    }

    public List<Produto> buscarPorNome(String nome) {
        List<Produto> resultado = new ArrayList<>();
        for (Produto produto : produtos) {
            if (produto.getNome().toLowerCase().contains(nome.toLowerCase())) {
                resultado.add(produto);
            }
        }
        return resultado;
    }

    public Produto buscarPorCodigo(String codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equalsIgnoreCase(codigo)) {
                return produto;
            }
        }
        return null;
    }

    public List<Produto> filtrarPorCategoria(String categoria) {
        List<Produto> resultado = new ArrayList<>();
        for (Produto p : produtos) {
            if (p.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public List<Produto> listarTodos() {
        return new ArrayList<>(produtos);
    }
}
