#include <stdio.h>

float celciusToFarenheit(float c){
return (c * 9/5)+32;
}
float celciusToRankine(float c){
	return (c + 273.15)*9/5);
}

float rankineToCelcius(float r){
	return (r * 5/9)-273.15;
}

float farenheitToKelvin(float f){
	return (f + 459.67)*5/9);
}

float kelvinToFahrenheit(float k){
	return (k * 9/5) - 459.67);

}

void main() {
	float temp;
	char option;
	printf("Please enter a temperature in Celsius.\n");
	scanf("%f"&temp);

	//celcius to rankine
		temp = celciusToRankine(temp); //temp is now in Rankine
		printf("%f\n"&temp);

	//rankine to  celcius
		temp = rankineToCelcius(temp); //temp is now in Celcius
		printf("%f\n"&temp);

	//celcius to farenheit
		temp = celciusToFarenheit(temp);//temp is now in Farenheit
		printf("%f\n"&temp);
 
	//farenheit to kelvin
		temp = farenheitToKelvin(temp);//temp is now in Kelvin
		printf("%f\n"&temp);
	
	//kelvin to farenheit
		temp = kelvinToFarenheit(temp);//temp is now in Farenheit
		printf("%f\n"&temp);
		
	
	
}