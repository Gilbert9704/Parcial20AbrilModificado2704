/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioCifrado;

/**
 *
 * @author Estudiante
 */
public class Stock extends ShareAsset {
    
    protected int totalShares;
    double valorEnElMercado;
    
    public Stock(int totalShares, String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
        this.totalShares = totalShares;
    }

    @Override
    public double getProfit() {
        double profit;
        
        profit = totalShares * currentPrice - totalCost;
        return profit;
    }

    @Override
    public double getMarketValue() {
   
        valorEnElMercado = totalShares * currentPrice; 
        return valorEnElMercado;
    }

    @Override
    public String toString() {
        return "Stock{" + "Empresa: " + symbol + " Costo Total: " + totalCost + " Precio Actual: " + currentPrice + " Total de acciones " + totalShares + 
                "Valor en el Mercado " + valorEnElMercado + '}';
    }
    
    
}
