package io.acostim.dagger_hilt_implementation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import javax.inject.Inject
import javax.inject.Singleton

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //field injection
    @Inject
    lateinit var someClass: SomeClass


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Snackbar.make(findViewById(R.id.main),someClass.doaThing(),5000).show()

        println(someClass.doaThing())
        println(someClass.doSomeOtherThing())

    }
}


@AndroidEntryPoint
class MyFragment: Fragment() {
    @Inject
    lateinit var someClass: SomeClass
}

@Singleton
class SomeClass
@Inject
constructor(
    private val someOtherClass: SomeOtherClass
) {
    fun doaThing(): String {
        return "Look I did a thing"
    }

    fun doSomeOtherThing(): String {
        return someOtherClass.doSomeOtherThing()
    }
}

class SomeOtherClass
@Inject
constructor() {
    fun doSomeOtherThing(): String {
        return "Doing something else"
    }
}