/*
 * TaxComputations.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.text.DecimalFormat;

public class TaxComputations {
	
	private static double basicRate = 0.04;
	private static double luxuryRate = 0.1;
	
	private void changeBasicRate(double d){
		basicRate = d;
		}
	private void changeLuxuryRate(double d){
		luxuryRate = d;
		}
	
	private static double computeBasicCost(double cost){
		return cost += (cost * basicRate);
		}
	private static double computerLuxuryCost(double cost){
		return cost += (cost * luxuryRate);
		}
		
	private static void convertToMoney(double cost){
		DecimalFormat twoDig = new DecimalFormat("0.00");
		System.out.println(twoDig.format(cost));
		}
	
	public static void main (String args[]) {
		TaxComputations demo = new TaxComputations();
		demo.convertToMoney(demo.computeBasicCost(10.00));
		
	}
}

