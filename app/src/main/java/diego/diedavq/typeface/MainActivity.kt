package diego.diedavq.typeface

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variables for typeface
        var typeFaceAlexBrush = Typeface.createFromAsset(assets, "fonts/AlexBrush-Regular.ttf")
        var typeFaceGrandHotel = Typeface.createFromAsset(assets, "fonts/GrandHotel-Regular.otf")
        var typeFacePacifico = Typeface.createFromAsset(assets, "fonts/Pacifico.ttf")

        //change typeface to  textView
        txtAlexBrush.typeface = typeFaceAlexBrush
        txtGranHotel.typeface = typeFaceGrandHotel
        txtPacifico.typeface = typeFacePacifico

    }
}
