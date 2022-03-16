override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mySum(a = 15, b = 23)
        val value = fonks(x = 15, y = 20)
        //Fonksiyonumuzdan dönen değeri başka değerlere atayabiliriz.

        val tony = Avengers("Tony", 45, "Genius", "Leader")
        println(tony.heroLevel)
        //tony.heroAge = 50
        //tony.heroLevel = "Leader"
        //tony.heroName = "Iron Man"
        //tony.heroType = "Genius"
        println(tony.heroAge)
        //Tanımladığımız özellikleri burda istediğimiz gibi kullnabiliriz.

    }
