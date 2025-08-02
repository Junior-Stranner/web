package br.com.judev.controller;

import br.com.judev.model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class ProdutoController {

    private final List<Produto> produtos = new ArrayList<>();

    public void carregarProdutos() {
        // Premier League
        produtos.add(new Produto("P001", "Camisa Manchester United 23/24", "Camisa oficial da temporada 2023/24", 299.90, 120, "Premier League"));
        produtos.add(new Produto("P002", "Camisa Arsenal 23/24", "Camisa vermelha e branca com detalhes dourados", 279.90, 95, "Premier League"));
        produtos.add(new Produto("P003", "Camisa Liverpool 23/24", "Camisa vermelha tradicional do Liverpool", 289.90, 110, "Premier League"));
        produtos.add(new Produto("P004", "Camisa Manchester City 23/24", "Camisa azul clara com detalhes brancos", 299.90, 85, "Premier League"));
        produtos.add(new Produto("P005", "Camisa Chelsea 23/24", "Camisa azul com design moderno", 269.90, 75, "Premier League"));
        produtos.add(new Produto("P006", "Camisa Tottenham 23/24", "Camisa branca tradicional com detalhes azuis", 249.90, 65, "Premier League"));
        produtos.add(new Produto("P007", "Camisa Newcastle 23/24", "Camisa listrada em preto e branco", 239.90, 80, "Premier League"));
        produtos.add(new Produto("P008", "Camisa Aston Villa 23/24", "Camisa vinho com azul", 229.90, 60, "Premier League"));
        produtos.add(new Produto("P009", "Camisa Leeds United 23/24", "Camisa branca com detalhes dourados", 219.90, 55, "Premier League"));
        produtos.add(new Produto("P010", "Camisa West Ham 23/24", "Camisa vinho com azul claro", 229.90, 70, "Premier League"));

        // La Liga
        produtos.add(new Produto("L001", "Camisa Real Madrid 23/24", "Camisa branca com detalhes dourados", 299.90, 150, "La Liga"));
        produtos.add(new Produto("L002", "Camisa Barcelona 23/24", "Camisa azul e grená", 299.90, 140, "La Liga"));
        produtos.add(new Produto("L003", "Camisa Atlético de Madrid 23/24", "Camisa listrada em vermelho e branco", 279.90, 100, "La Liga"));
        produtos.add(new Produto("L004", "Camisa Sevilla 23/24", "Camisa branca tradicional", 249.90, 80, "La Liga"));
        produtos.add(new Produto("L005", "Camisa Real Betis 23/24", "Camisa verde e branca", 239.90, 75, "La Liga"));
        produtos.add(new Produto("L006", "Camisa Real Sociedad 23/24", "Camisa azul e branca", 229.90, 65, "La Liga"));
        produtos.add(new Produto("L007", "Camisa Villarreal 23/24", "Camisa amarela", 219.90, 60, "La Liga"));
        produtos.add(new Produto("L008", "Camisa Valencia 23/24", "Camisa branca com preto", 219.90, 70, "La Liga"));
        produtos.add(new Produto("L009", "Camisa Mallorca 23/24", "Camisa vermelha com preto", 209.90, 50, "La Liga"));
        produtos.add(new Produto("L010", "Camisa Celta de Vigo 23/24", "Camisa azul clara", 209.90, 55, "La Liga"));

        // Seleções
        produtos.add(new Produto("S001", "Camisa Brasil 2024", "Camisa amarela tradicional da seleção brasileira", 299.90, 200, "Seleções"));
        produtos.add(new Produto("S002", "Camisa Argentina 2024", "Camisa azul e branca da campeã mundial", 299.90, 180, "Seleções"));
        produtos.add(new Produto("S003", "Camisa França 2024", "Camisa azul da seleção francesa", 289.90, 160, "Seleções"));
        produtos.add(new Produto("S004", "Camisa Alemanha 2024", "Camisa branca com preto", 289.90, 150, "Seleções"));
        produtos.add(new Produto("S005", "Camisa Espanha 2024", "Camisa vermelha tradicional", 279.90, 140, "Seleções"));
        produtos.add(new Produto("S006", "Camisa Inglaterra 2024", "Camisa branca com azul escuro", 279.90, 130, "Seleções"));
        produtos.add(new Produto("S007", "Camisa Itália 2024", "Camisa azul da Azzurra", 269.90, 120, "Seleções"));
        produtos.add(new Produto("S008", "Camisa Portugal 2024", "Camisa vermelha com verde", 269.90, 110, "Seleções"));
        produtos.add(new Produto("S009", "Camisa Holanda 2024", "Camisa laranja vibrante", 259.90, 100, "Seleções"));
        produtos.add(new Produto("S010", "Camisa Uruguai 2024", "Camisa azul clara com detalhes pretos", 259.90, 90, "Seleções"));
    }

    public synchronized boolean baixarEstoque(String codigo, int quantidade) {
        Produto produto = buscarPorCodigo(codigo);

        if (produto != null && produto.getEstoque() >= quantidade && quantidade > 0) {
            produto.setEstoque(produto.getEstoque() - quantidade);
            return true;
        }
        return false;
    }

    public int verificarEstoque(String codigo) {
        Produto produto = buscarPorCodigo(codigo);
        return produto != null ? produto.getEstoque() : -1; // -1 = produto não existe
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
