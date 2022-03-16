package com.example.kotlin2

class Avengers {
    //Özelliklerini (property) tanımlıyoruz.
    var heroType = ""
    var heroAge = 0
    var heroLevel = ""
    var heroName = ""

    //constructor sınıfımızdan bir obje oluşturulduğunda çağırılcak metod anlamına gelmektedir.
    //Clan code için önemli olabilir.
    constructor(nameInput: String, ageInput: Int, typeInput: String, levelInput: String){
        this.heroName = nameInput
        this.heroAge = ageInput
        this.heroType = typeInput
        this.heroLevel = levelInput
        //this içinde bulunduğu bir üst kod parçacığı olan classlara referansta bulunur.
    }

}
