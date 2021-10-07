package com.example.problem3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telecom.Call
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.recyclerview.*
import java.text.FieldPosition

class MainActivity : AppCompatActivity(), MyAdapter.ItemClickListener {
    var products = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recyclerview)

        val product1: Product = Product("RGA Voyager 7\" 16GB Android Tablet", 35.0, "Black", R.drawable.tablet,559774465," 7” 1024 x 600 HD IPS Touch Display - Enjoy a wider viewing angle and a pixel-rich display\n" +
                "2GB RAM/16GB Storage - Powerful, capable performance\n" +
                "Android 10 Go Edition / Google Play - Access to millions of apps (Youtube, Facebook, Netflix and Game apps)\n" +
                "Front-facing Camera, Bluetooth Connectivity and WiFi\n" +
                "6Hrs Battery Life - Long-lasting battery; An AC charger included")
        val product2: Product = Product("HP Flyer Red 15.6\" Laptop", 299.0, "Black & Red", R.drawable.computer,555977443," 15.6 inch HD BrightView WLED-backlit display (1366x768) with build in HD webcam; SuperMulti DVD burner, HDMI\n" +
                "Intel Pentium Quad-Core N3540 processor 2.16GHz (with Max Turbo Speed of 2.66GHz), 4GB DDR3 SDRAM (2 slots), 500GB SATA hard drive\n" +
                "2 x USB 3.0 ports, 1 x USB 2.0 port, 1 x headphone/microphone combo jack, 1 x RJ-45 Ethernet port, 1 x HDMI port; 10/100Base-T Ethernet, 802.11b/g/n Wireless LAN;\n" +
                "Windows 10 Home; SuperMulti DVD Burner, Full-size island-style keyboard with numeric keypad")
        val product3: Product = Product("VIZIO 70\" Class 4K", 1298.0, "Black", R.drawable.tv,559774432," Dolby Vision HDR - Watch your favorite content with the incredible brightness, contrast and color with support for Dolby Vision, HDR10, and HLG high dynamic range formats\n" +
                "4K Ultra HD - With over 8 million pixels, 4 times the resolution of 1080p and pixel level brightness adjustments with Active Pixel Tuning- stream your favorite movies, TV shows, and game with breathtaking detail.\n" +
                "SmartCast - With lightning fast navigation, enjoy instant access to the best selection of apps from top tier streaming services like Netflix, Disney Plus, YouTube, and many more right on the TV using the all-new smart remote or SmartCast Mobile app")
        val product4: Product = Product("Canon PIXMA PRO-200", 200.0, "Black", R.drawable.printer,32123123," With a enhanced 8-color dye-based ink system, you’ll enjoy rich, vibrant professional printing, every time.\n" +
                "Save space in your home or studio with a COMPACT DESIGN\n" +
                "The PIXMA PRO-200 is also fast and efficient, delivering high quality bordered A3+ prints in just 90 seconds.\n" +
                "Compatible with a wide range of media and sizes, your can print borderless up to 13”x19” or a custom size up to 13” x 39”.")
        val product5: Product = Product("IPhone X 128GB Gray", 900.0, "Gray",R.drawable.iphone,3242131," This phone is unlocked and compatible with any carrier of choice on GSM and CDMA networks (e.g. AT&T, T-Mobile, Sprint, Verizon, US Cellular, Cricket, Metro, Tracfone, Mint Mobile, etc.).\n" +
                "Tested for battery health and guaranteed to have a minimum battery capacity of 80%.\n" +
                "Successfully passed a full diagnostic test which ensures like-new functionality and removal of any prior-user personal information.\n" +
                "The device does not come with headphones or a SIM card. It does include a generic (Mfi certified) charger and charging cable.")

        products.add(product1)
        products.add(product2)
        products.add(product3)
        products.add(product4)
        products.add(product5)

        recyclerView1.layoutManager = LinearLayoutManager(this)

        val adapter = MyAdapter(products, this)
        recyclerView1.adapter = adapter

    }
    override fun onItemClick (position: Int){
        val intent = Intent(applicationContext, Item_List::class.java)
        intent.putExtra("product", products[position])
        startActivity(intent)
    }
}