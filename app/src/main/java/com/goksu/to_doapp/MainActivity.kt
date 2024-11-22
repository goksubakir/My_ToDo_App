package com.goksu.to_doapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.goksu.to_doapp.ui.theme.ToDoAppTheme
import androidx.navigation.compose.rememberNavController
import com.goksu.to_doapp.AppNavHost



// ComponentActivity, Jetpack Compose ile uyumlu bir activity türüdür.
class MainActivity : ComponentActivity() {

    // onCreate fonksiyonu, aktivite ilk oluşturulduğunda çağrılır.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) // ComponentActivity'nin onCreate fonksiyonunu çağırıyoruz.

        // Uygulamanın içeriğini oluşturmak için `setContent` kullanıyoruz.
        // Jetpack Compose ile UI öğeleri burada tanımlanır.
        setContent {
            // `ToDoAppTheme` uygulamanın genel temasıdır.
            // Temaya özgü renk, tipografi ve şekil yapılandırmalarını uygular.
            ToDoAppTheme {
                // Jetpack Compose'da navigasyonu yönetmek için bir `NavController` oluşturuyoruz.
                // `rememberNavController` navigasyon durumunu hatırlayan ve yönlendirmeyi sağlayan bir yapı oluşturur.
                val navController = rememberNavController()

                // `AppNavHost` fonksiyonunu çağırıyoruz.
                // Bu, navigasyonu kontrol eden ve ekranlar arasındaki geçişleri tanımlayan Composable'dır.
                AppNavHost(navController = navController)
            }
        }
    }
}

