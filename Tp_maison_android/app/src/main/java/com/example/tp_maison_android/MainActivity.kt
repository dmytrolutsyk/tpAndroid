package com.example.tp_maison_android
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.tp_maison_android.constraintlayout.ConstraintLayoutActivity
import kotlinx.android.synthetic.main.activity_start.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var ValidateBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        var ValidateBtn = findViewById<View>(R.id.ValidateBtn)
        ValidateBtn.setOnClickListener {
            //Navigate
            var Following = findViewById<View>(R.id.FollowingField) as EditText
            val Followingcpt = Following.text.toString()
            var Follower = findViewById<View>(R.id.FollowerField) as EditText
            val Followercpt = Follower.text.toString()
            var Name = findViewById<View>(R.id.NameField) as EditText
            val Namecpt = Name.text.toString()

            val intent = Intent(this, ConstraintLayoutActivity::class.java)
            intent.putExtra("Following", Followingcpt)
            intent.putExtra("Follower", Followercpt)
            intent.putExtra("Name", Namecpt)

            val text = "Vous n'avez pas rempli tous les champs!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)
            if (Followercpt == "" || Followingcpt == "" || Namecpt == ""){
                toast.show()
            }
            else {
                startActivity(intent)
            }
        }
    }
}
