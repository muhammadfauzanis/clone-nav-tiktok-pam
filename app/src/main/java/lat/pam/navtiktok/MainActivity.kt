package lat.pam.navtiktok

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener
 {

    private lateinit var bottomNavigationView: BottomNavigationView
    private val homeFragment = HomeFragment()
    private val friendFragment = FriendFragment()
    private val inboxFragment = InboxFragment()
    private val profileFragment = ProfileFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottomView)
        bottomNavigationView.setOnItemSelectedListener(this)
        bottomNavigationView.selectedItemId = R.id.home
    }

     override fun onNavigationItemSelected(item: MenuItem): Boolean {
         when (item.itemId) {
             R.id.home -> {
                 supportFragmentManager.beginTransaction()
                     .replace(R.id.flFragment, homeFragment)
                     .commit()
                 return true
             }
             R.id.friend -> {
                 supportFragmentManager.beginTransaction()
                     .replace(R.id.flFragment, friendFragment)
                     .commit()
                 return true
             }
             R.id.inbox -> {
                 supportFragmentManager.beginTransaction()
                     .replace(R.id.flFragment, inboxFragment)
                     .commit()
                 return true
             }
             R.id.profile -> {
                 supportFragmentManager.beginTransaction()
                     .replace(R.id.flFragment, profileFragment)
                     .commit()
                 return true
             }
         }
         return false
     }
 }