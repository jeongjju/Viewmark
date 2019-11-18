package com.example.bookmark;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {
    //private FragmentManager fragmentManager = getSupportFragmentManager();

    //private BookmarkFragment bookmarkFragment = new BookmarkFragment();
    //private Menu2Fragment menu2Fragment = new Menu2Fragment();
    //private Menu3Fragment menu3Fragment = new Menu3Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myhome);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);
        if(fragment == null){
            fragment = new BookmarkFragment();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer,fragment)
                    .commit();
        }
//        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
//        FragmentTransaction transaction = fragmentManager.beginTransaction();
//        transaction.replace(R.id.fragmentContainer, bookmarkFragment).commitAllowingStateLoss();
//
//        // bottomNavigationView의 아이템이 선택될 때 호출될 리스너 등록
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                FragmentTransaction transaction = fragmentManager.beginTransaction();
//                switch (item.getItemId()) {
//                    case R.id.navigation_menu1: {
//                        transaction.replace(R.id.fragmentContainer, bookmarkFragment).commitAllowingStateLoss();
//                        break;
//                    }
//                    case R.id.navigation_menu2: {
//                        transaction.replace(R.id.fragmentContainer, menu2Fragment).commitAllowingStateLoss();
//                        break;
//                    }
//                    case R.id.navigation_menu3: {
//                        transaction.replace(R.id.fragmentContainer, menu3Fragment).commitAllowingStateLoss();
//                        break;
//                    }
//                }
//
//                return true;
//            }
//        });
    }
}
