class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tony = Avengers()
        tony.heroAge = 50
        tony.heroLevel = "Leader"
        tony.heroName = "Iron Man"
        tony.heroType = "Genius"
        println(tony.heroAge)
        //Tanımladığımız özellikleri burda istediğimiz gibi kullnabiliriz.

    }
