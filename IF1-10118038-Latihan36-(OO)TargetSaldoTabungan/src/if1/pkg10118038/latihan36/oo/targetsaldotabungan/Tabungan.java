/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan36.oo.targetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Target Saldo Tabungan
 */
public class Tabungan {
    double saldoAwal, saldoTarget, bunga;
	int bulan;
	
	public Tabungan(double saldoAwal, double saldoTarget, double bunga){
		this.saldoAwal = saldoAwal;
		this.saldoTarget = saldoTarget;
		this.bunga = bunga;
	}
	
	public String formatting(double saldo){
		DecimalFormat Idr = (DecimalFormat) DecimalFormat.getCurrencyInstance();
		DecimalFormatSymbols RP = new DecimalFormatSymbols();
		RP.setCurrencySymbol(" Rp. ");
		RP.setMonetaryDecimalSeparator(',');
		RP.setGroupingSeparator('.');
		Idr.setDecimalFormatSymbols(RP);
		return Idr.format((int) saldo).replaceAll(",00", "");
	}
	
	public void hitung(){
		while (saldoAwal < saldoTarget){
			saldoAwal += saldoAwal*bunga;
			System.out.println("Saldo di bulan ke-"+(++bulan)+formatting(saldoAwal));
		}
	}
}
