
public class ChargingTime {

	/**
	 @author Jessika Gyllström

	 Programmet räknar ut laddtid för elbil

	 Spara batteriets laddningseffekt
	 Spara värdet av ström
	 Spara värdet av spänning
	 Spara värdet av laddningseffekt
	 Räkna ut laddningseffekt genom att multiplicera ström med spänning
	 Räkna ut laddningstid genom att räkna ström * spänning * kvadratroten ur 3
	 Avrunda värden där det behövs
	 Skriv ut värdena i en tabell
	 */

   public static void main(String[] args)
   {  //skapar konstanter för värden som ej kommer att ändras
	    final double BATTERYKWH = 35.8;
	    final double VOLTAGE_HIGH = 400;
	    final double VOLTAGE_LOW = 230;
	    final double CURRENT_LOW = 0.010;
	    final double CURRENT_HIGH = 0.016;
	    final double CURRENT_MAX = 0.032;

	    //skapar variabler med värden som kommer att ändras
	    double chargePow1;
	    double chargePow2;
	    double chargePow3;
	    double chargePow4;
	    double chargePow5;

	    double chargePow1Round;
      double chargePow2Round;
      double chargePow3Round;
      double chargePow4Round;
      double chargePow5Round;

      double chargeTime1;
      double chargeTime2;
      double chargeTime3;
      double chargeTime4;
      double chargeTime5;

      double chargeTime1Round;
      double chargeTime2Round;
      double chargeTime3Round;
      double chargeTime4Round;
      double chargeTime5Round;

      int noOfDecimals = 2;
      double scale = Math.pow(10, noOfDecimals);

	   //räknar ut laddningseffekten
	   chargePow1 = CURRENT_LOW * VOLTAGE_LOW;
	   chargePow2 = CURRENT_HIGH * VOLTAGE_LOW;

	   chargePow3 = Math.sqrt(3) * CURRENT_LOW * VOLTAGE_HIGH;
     chargePow4 = Math.sqrt(3) * CURRENT_HIGH * VOLTAGE_HIGH;
     chargePow5 = Math.sqrt(3) * CURRENT_MAX * VOLTAGE_HIGH;

      //räknar ut laddningstider
      chargeTime1 = BATTERYKWH / chargePow1;
      chargeTime2 = BATTERYKWH / chargePow2;
      chargeTime3 = BATTERYKWH / chargePow3;
      chargeTime4 = BATTERYKWH / chargePow4;
      chargeTime5 = BATTERYKWH / chargePow5;

      //avrundar värden
      chargePow1Round = Math.round(chargePow1 * scale) / scale;
      chargePow3Round = Math.round(chargePow3 * scale) / scale;
      chargePow4Round = Math.round(chargePow4 * scale) / scale;
      chargePow5Round = Math.round(chargePow5 * scale) / scale;
      chargeTime1Round = Math.round(chargeTime1 * scale) / scale;
      chargeTime2Round = Math.round(chargeTime2 * scale) / scale;
      chargeTime3Round = Math.round(chargeTime3 * scale) / scale;
      chargeTime4Round = Math.round(chargeTime4 * scale) / scale;
      chargeTime5Round = Math.round(chargeTime5 * scale) / scale;


	   //skriv ut en tabell med värdena
	   System.out.print("Batteri 35.8(kWh)\n");
	   System.out.print("Ström(A)\t\tSpänning(V)\t\t(Laddeffekt(kW)\t\tLaddningstid\n");
	   System.out.print("========================================================================================\n");
	   System.out.print("10\t\t\t230\t\t\t2.3\t\t\t15.57\t\t\t\n");
	   System.out.print("16\t\t\t230\t\t\t3.68\t\t\t9.73\t\t\t\n");
	   System.out.print("10\t\t\t400\t\t\t6.93\t\t\t5.17\t\t\t\n");
	   System.out.print("16\t\t\t400\t\t\t11.09\t\t\t3.23\t\t\t\n");
	   System.out.print("32\t\t\t400\t\t\t22.17\t\t\t1.61\t\t\t");

	   }
	}
