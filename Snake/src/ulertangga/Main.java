package ulertangga;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	Scanner scan = new Scanner(System.in);
	Random  Rand = new Random();
	Vector <getset> Gim = new Vector<>();
	int Geser = 0,Geser_2 = 0,Geser_3 = 0;
	int Tanda = 0,Tanda2 = 0,Tanda3 = 0;
	int P1 = 0;
	int P2 = 0;
	int P3 = 0;
	p_one P_1;
	p_two  P_2;
	p_three P_3;
	int choose = 0;
	int Dadu,Dadu_2,Dadu_3;
public void twoPemain(){
int ronde = 1;

do{
	System.out.printf("\n");
	System.out.printf("\n");
	System.out.printf("Ronde %d\n",ronde);
	Geser = P1;
	System.out.printf("\n");
	System.out.print("Pemain A Memutar Dadu(press enter to roll): ");
	String input1 = scan.nextLine();
	int val = 0;
	for (int idx = 0; idx < input1.length(); idx++){
		val+= input1.charAt(idx);
	}val = val % 10;
	if (val == 0){
		val = 1;
		}

	Dadu = 1+ Rand.nextInt(6);
	Tanda = P1 + Dadu;

	if(Tanda>100){
		Tanda = 100 - (Tanda - 100);
	}if(Tanda == 13){
		Tanda = 7;
		System.out.println("IYAKK kena uler turun deh ke 7");
	}if(Tanda == 25){
		Tanda = 40;
		System.out.println("YEYY ada tangga sana manjat ke 40");
	}if(Tanda == 50 ){
		Tanda = 38;
		System.out.println("IYAKK kena uler turun deh ke 38");
	}if(Tanda == 63 ){
		Tanda = 78;
		System.out.println("YEYY ada tangga sana manjat ke 78");
	}if(Tanda == 83 ){
		Tanda = 97;
		System.out.println("YEYY ada tangga sana manjat ke 97");
	}if(Tanda == 95 ){
		Tanda = 76;
		System.out.println("IYAKK kena uler turun deh ke 76");
	}
	P_1 = new p_one(Dadu,Geser,Tanda);
	
	Gim.add(P_1);

	P1=Tanda;
	System.out.printf("Putar dadu :  %-3d            \n",Dadu);
	System.out.printf("Geser dari :  %-2d  ke  %-3d    \n",Geser,Tanda);

	ronde++;
	if(Tanda == 100 ){
		break;
	}	
	Geser_2 = P2;
	System.out.printf("\n");
	System.out.print("Pemain B Memutar Dadu(press enter to roll): ");
	String input2 = scan.nextLine();
	
	int val2 = 0;
	for (int idx = 0; idx < input2.length(); idx++){
		val2+= input2.charAt(idx);
	}
	val2 = val2 % 10;
	if (val2 == 0){
		val2 = 1;
	}
	Dadu_2 = 1 + Rand.nextInt(6);
	Tanda2 = P2 + Dadu_2;

	if(Tanda2 > 100){
		Tanda2 = 100 - (Tanda2 - 100);
	}if(Tanda>100){
		Tanda = 100 - (Tanda - 100);
	}if(Tanda == 13){
		Tanda = 7;
		System.out.println("IYAKK kena uler turun deh ke 7");
	}if(Tanda == 25){
		Tanda = 40;
		System.out.println("YEYY ada tangga sana manjat ke 40");
	}if(Tanda == 50 ){
		Tanda = 38;
		System.out.println("IYAKK kena uler turun deh ke 38");
	}if(Tanda == 63 ){
		Tanda = 78;
		System.out.println("YEYY ada tangga sana manjat ke 78");
	}if(Tanda == 83 ){
		Tanda = 97;
		System.out.println("YEYY ada tangga sana manjat ke 97");
	}if(Tanda == 95 ){
		Tanda = 76;
		System.out.println("IYAKK kena uler turun deh ke 76");
	}
	P_2 = new p_two (Dadu_2,Geser_2,Tanda2);
	Gim.add(P_2);
	
	P2 = Tanda2;
	System.out.printf("Putar dadu :  %-3d            \n",Dadu_2);
	System.out.printf("Geser dari : %-2d  ke  %-3d    \n",Geser_2,Tanda2);
	if(Tanda2 == 100){
		break;
	}
}while(ronde < 26);
if(Tanda > Tanda2){
	System.out.printf("\n");
	System.out.println("Pemain A Win!!!");
	System.out.println("Papan Nilai");
	System.out.printf("\n");
	System.out.printf("Pemain A memiliki nilai:  %-3d    \n",Tanda);
	System.out.printf("Pemain B memiliki nilai:  %-3d    \n",Tanda2);
	System.out.printf("\n");
	
}else{
	System.out.printf("\n");
	System.out.println("Pemain B Win!");
	System.out.println("Papan Nilai");
	System.out.printf("\n");
	System.out.printf("|Pemain B memiliki nilai:  %-3d    \n",Tanda2);
	System.out.printf("|Pemain A memiliki nilai:  %-3d    \n",Tanda);
	System.out.printf("\n");
	}
}
public void threePemain(){
int ronde = 1;

do{
	System.out.printf("\n");
	System.out.printf("\n");
	System.out.printf("ROUND %d\n",ronde);
	Geser = P1;
	System.out.printf("\n");
	System.out.print("Pemain A Memutar Dadu(press enter to roll): ");
	String input1 = scan.nextLine();
	int val = 0;
	for (int idx = 0; idx < input1.length(); idx++){
		val+= input1.charAt(idx);
	}
	val = val % 10;
	if (val == 0){
		val = 1;
	}
	Dadu = 1+ Rand.nextInt(6);
	Tanda = P1+Dadu;

	if(Tanda>100){
		Tanda = 100 - (Tanda - 100);
	}if(Tanda>100){
		Tanda = 100 - (Tanda - 100);
	}if(Tanda == 13){
		Tanda = 7;
		System.out.println("IYAKK kena uler turun deh ke 7");
	}if(Tanda == 25){
		Tanda = 40;
		System.out.println("YEYY ada tangga sana manjat ke 40");
	}if(Tanda == 50 ){
		Tanda = 38;
		System.out.println("IYAKK kena uler turun deh ke 38");
	}if(Tanda == 63 ){
		Tanda = 78;
		System.out.println("YEYY ada tangga sana manjat ke 78");
	}if(Tanda == 83 ){
		Tanda = 97;
		System.out.println("YEYY ada tangga sana manjat ke 97");
	}if(Tanda == 95 ){
		Tanda = 76;
		System.out.println("IYAKK kena uler turun deh ke 76");
	}
	P_1 = new p_one(Dadu,Geser,Tanda);
	Gim.add(P_1);
	P1 = Tanda;
	System.out.printf("Putar dadu :  %-3d            \n",Dadu);
	System.out.printf("Geser dari : %-2d  ke  %-3d    \n",Geser,Tanda);
	
	ronde++;
	if(Tanda == 100 ){
		break;
	}	
	Geser_2 = P2;
	System.out.printf("\n");
	System.out.print("Pemain B Memutar Dadu(press enter to roll): ");
	String input2 = scan.nextLine();

	int val2 = 0;
	for (int idx = 0; idx < input2.length(); idx++){
		val2+= input2.charAt(idx);
	}
	val2=val2%10;
	if (val2==0){
		val2=1;
	}
	Dadu_2 = 1 + Rand.nextInt(6);
	Tanda2 = P2 + Dadu_2;

	if(Tanda2 > 100){
		Tanda2 = 100 - (Tanda2 - 100);
	}if(Tanda>100){
		Tanda = 100 - (Tanda - 100);
	}if(Tanda == 13){
		Tanda = 7;
		System.out.println("IYAKK kena uler turun deh ke 7");
	}if(Tanda == 25){
		Tanda = 40;
		System.out.println("YEYY ada tangga sana manjat ke 40");
	}if(Tanda == 50 ){
		Tanda = 38;
		System.out.println("IYAKK kena uler turun deh ke 38");
	}if(Tanda == 63 ){
		Tanda = 78;
		System.out.println("YEYY ada tangga sana manjat ke 78");
	}if(Tanda == 83 ){
		Tanda = 97;
		System.out.println("YEYY ada tangga sana manjat ke 97");
	}if(Tanda == 95 ){
		Tanda = 76;
		System.out.println("IYAKK kena uler turun deh ke 76");
	}
	P_2=new p_two(Dadu_2,Geser_2,Tanda2);
	Gim.add(P_2);
	P2 = Tanda2;

	System.out.printf("Putar dadu :  %-3d            \n",Dadu_2);
	System.out.printf("Geser dari : %-2d  ke  %-3d    \n",Geser_2,Tanda2);

	if(Tanda2 ==100){
		break;
	}	
	Geser_3 =P3;
	System.out.printf("\n");
	System.out.print("Pemain C Memutar Dadu(press enter to roll): ");
	String input3 =scan.nextLine();
	
	int val3=0;
	for (int idx = 0; idx < input2.length(); idx++){
		val3+= input2.charAt(idx);
	}val3 = val3 % 10;
	if (val3 == 0){
		val3 = 1;
	}
	Dadu_3 = 1 + Rand.nextInt(6);
	Tanda3 = P3 + Dadu_3;

	if(Tanda3 > 100){
		Tanda3 = 100 - (Tanda3 - 100);
	}if(Tanda>100){
		Tanda = 100 - (Tanda - 100);
	}if(Tanda == 13){
		Tanda = 7;
		System.out.println("IYAKK kena uler turun deh ke 7");
	}if(Tanda == 25){
		Tanda = 40;
		System.out.println("YEYY ada tangga sana manjat ke 40");
	}if(Tanda == 50 ){
		Tanda = 38;
		System.out.println("IYAKK kena uler turun deh ke 38");
	}if(Tanda == 63 ){
		Tanda = 78;
		System.out.println("YEYY ada tangga sana manjat ke 78");
	}if(Tanda == 83 ){
		Tanda = 97;
		System.out.println("YEYY ada tangga sana manjat ke 97");
	}if(Tanda == 95 ){
		Tanda = 76;
		System.out.println("IYAKK kena uler turun deh ke 76");
	}
	P_3 = new p_three (Dadu_3,Geser_3,Tanda3);
	Gim.add(P_3);
	P3 = Tanda3;

	System.out.printf("Putar dadu :  %-3d            \n",Dadu_3);
	System.out.printf("Geser dari : %-2d  ke  %-3d    \n",Geser_3,Tanda3);


	if(Tanda3 == 100){
		break;
	}	
}while(ronde < 26);

if(Tanda > Tanda2 && Tanda > Tanda3 && Tanda2 > Tanda3){
	System.out.printf("\n");
	System.out.println("Pemain A Win!!!");
	System.out.println("Papan Nilai");
	System.out.printf("\n");
	System.out.printf("Pemain A memiliki nilai:  %-3d    \n",Tanda);
	System.out.printf("Pemain B memiliki nilai:  %-3d    \n",Tanda2);
	System.out.printf("Pemain C memiliki nilai:  %-3d    \n",Tanda3);
	System.out.printf("\n");
	
}else if(Tanda > Tanda2 && Tanda > Tanda3 && Tanda2 < Tanda3){
	System.out.printf("\n");
	System.out.println("Pemain A Win!!!");
	System.out.println("Papan Nilai");
	System.out.printf("\n");
	System.out.printf("Pemain A memiliki nilai:  %-3d    \n",Tanda);
	System.out.printf("Pemain C memiliki nilai:  %-3d    \n",Tanda3);
	System.out.printf("Pemain B memiliki nilai:  %-3d    \n",Tanda2);
	System.out.printf("\n");
	
}else if(Tanda > Tanda2 && Tanda > Tanda3 && Tanda2 == Tanda3 ){
	System.out.printf("\n");
	System.out.println("Pemain A Win!!!");
	System.out.println("Papan Nilai");
	System.out.printf("\n");
	System.out.printf("Pemain A memiliki nilai:  %-3d    \n",Tanda);
	System.out.printf("Pemain C memiliki nilai:  %-3d    \n",Tanda2);
	System.out.printf("Pemain B memiliki nilai:  %-3d    \n",Tanda3);
	System.out.printf("\n");
	
}else if(Tanda2 > Tanda && Tanda2 > Tanda3 && Tanda > Tanda3){
	System.out.printf("\n");
	System.out.println("Pemain B Win!");
	System.out.println("Papan Nilai");
	System.out.printf("\n");
	System.out.printf("Pemain B memiliki nilai:  %-3d    \n",Tanda2);
	System.out.printf("Pemain A memiliki nilai:  %-3d    \n",Tanda);
	System.out.printf("Pemain C memiliki nilai:  %-3d    \n",Tanda3);
	System.out.printf("\n");
}else if(Tanda2 > Tanda && Tanda2 > Tanda3 && Tanda < Tanda3){
	System.out.printf("\n");
	System.out.println("Pemain B Win!");
	System.out.println("Papan Nilai");
	System.out.printf("\n");
	System.out.printf("Pemain B memiliki nilai:  %-3d    \n",Tanda2);
	System.out.printf("Pemain C memiliki nilai:  %-3d    \n",Tanda3);
	System.out.printf("Pemain A memiliki nilai:  %-3d    \n",Tanda);
	System.out.printf("\n");
}else if(Tanda2 > Tanda && Tanda2 > Tanda3 && Tanda == Tanda3){
	System.out.printf("\n");
	System.out.println("Pemain B Win!");
	System.out.println("Papan Nilai");
	System.out.printf("\n");
	System.out.printf("Pemain B memiliki nilai:  %-3d    \n",Tanda2);
	System.out.printf("Pemain A memiliki nilai:  %-3d    \n",Tanda);
	System.out.printf("Pemain C memiliki nilai:  %-3d    \n",Tanda3);
	System.out.printf("\n");
}else if(Tanda3 > Tanda && Tanda3 > Tanda2 && Tanda < Tanda2){
	System.out.printf("\n");
	System.out.println("Pemain C Win!");
	System.out.println("Papan Nilai");
	System.out.printf("\n");
	System.out.printf("Pemain C memiliki nilai:  %-3d    \n",Tanda3);
	System.out.printf("Pemain B memiliki nilai:  %-3d    \n",Tanda2);
	System.out.printf("Pemain A memiliki nilai:  %-3d    \n",Tanda);
	System.out.printf("\n");
}else if(Tanda3 > Tanda && Tanda3 > Tanda2 && Tanda > Tanda2){
	System.out.printf("\n");
	System.out.println("Pemain C Win!");
	System.out.println("Papan Nilai");
	System.out.printf("\n");
	System.out.printf("Pemain C memiliki nilai:  %-3d    \n",Tanda3);
	System.out.printf("Pemain A memiliki nilai:  %-3d    \n",Tanda);
	System.out.printf("Pemain B memiliki nilai:  %-3d    \n",Tanda2);
	System.out.printf("\n");
}else if(Tanda3 > Tanda && Tanda3 > Tanda2 && Tanda == Tanda2){
	System.out.printf("\n");
	System.out.println("Pemain C Win!");
	System.out.println("Papan Nilai");
	System.out.printf("\n");

	System.out.printf("Pemain C memiliki nilai:  %-3d    \n",Tanda3);
	System.out.printf("Pemain A memiliki nilai:  %-3d    \n",Tanda);
	System.out.printf("Pemain B memiliki nilai:  %-3d    \n",Tanda2);
	System.out.printf("\n");
	}
}
public void Menu() {
	do{
		view();
		System.out.print(" Input : ");
		try {
			choose = scan.nextInt();
		} catch (Exception e) {
			choose = -1;
			System.out.println("Input harus berupa angka !!");
			System.out.println("");
		}
		scan.nextLine();
	}while(choose < 1 || choose > 3);
	}
	public void view() {
		System.out.println("Snakes Ladder Game");
		System.out.println("1. Play (2P)");
		System.out.println("2. Play (3P)");
		System.out.println("3. Exit");
	}
public Main() {
	do{
		Menu();
		
		switch(choose){
		case 1:{
			twoPemain();
			System.out.println("Press enter to continue...");
			scan.nextLine();
			break;
		}
			case 2:{
				threePemain();
				System.out.println("Press enter to continue...");
				scan.nextLine();
				break;
			}
			case 3:{
				System.out.println("Terima kasih telah menggunakan aplikasi ini!");
				break;
			}
		}
	}while(choose != 3);
	
}
public static void main(String[] args) {
	new Main();
}

}
