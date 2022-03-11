package edu.hanu.a1_1901040098;

import static android.view.View.GONE;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;

import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ScrollView alphabet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imgA = findViewById(R.id.imgA);
        imgA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a);
                mediaPlayer.start();
            }
        });
        ImageButton a = findViewById(R.id.a);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.a);
                mediaPlayer.start();
            }
        });

        ImageButton imgI = findViewById(R.id.imgI);
        imgI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.i);
                mediaPlayer.start();
            }
        });
        ImageButton i = findViewById(R.id.i);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,R.raw.i);
                mediaPlayer.start();
            }
        });

        ImageButton imgU = findViewById(R.id.imgU);
        imgU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.u);
                mediaPlayer.start();
            }
        });
        ImageButton u = findViewById(R.id.u);
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.u);
                mediaPlayer.start();
            }
        });

        ImageButton imgE = findViewById(R.id.imgE);
        imgE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.e);
                mediaPlayer.start();
            }
        });
        ImageButton e = findViewById(R.id.e);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.e);
                mediaPlayer.start();
            }
        });

        ImageButton imgO = findViewById(R.id.imgO);
        imgO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.o);
                mediaPlayer.start();
            }
        });
        ImageButton o = findViewById(R.id.o);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.o);
                mediaPlayer.start();
            }
        });

        ImageButton imgKa = findViewById(R.id.imgKa);
        imgKa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ka);
                mediaPlayer.start();
            }
        });
        ImageButton ka = findViewById(R.id.ka);
        ka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ka);
                mediaPlayer.start();
            }
        });

        ImageButton imgKi = findViewById(R.id.imgKi);
        imgKi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ki);
                mediaPlayer.start();
            }
        });
        ImageButton ki = findViewById(R.id.ki);
        ki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ki);
                mediaPlayer.start();
            }
        });

        ImageButton imgKu = findViewById(R.id.imgKu);
        imgKu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ku);
                mediaPlayer.start();
            }
        });
        ImageButton ku = findViewById(R.id.ku);
        ku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ku);
                mediaPlayer.start();
            }
        });

        ImageButton imgKe = findViewById(R.id.imgKe);
        imgKe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ke);
                mediaPlayer.start();
            }
        });
        ImageButton ke = findViewById(R.id.ke);
        ke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ke);
                mediaPlayer.start();
            }
        });

        ImageButton imgKo = findViewById(R.id.imgKo);
        imgKo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ko);
                mediaPlayer.start();
            }
        });
        ImageButton ko = findViewById(R.id.ko);
        ko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ko);
                mediaPlayer.start();
            }
        });

        ImageButton imgSa = findViewById(R.id.imgSa);
        imgSa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sa);
                mediaPlayer.start();
            }
        });
        ImageButton sa = findViewById(R.id.sa);
        sa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.sa);
                mediaPlayer.start();
            }
        });

        ImageButton imgShi = findViewById(R.id.imgShi);
        imgShi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.shi);
                mediaPlayer.start();
            }
        });
        ImageButton shi = findViewById(R.id.shi);
        shi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.shi);
                mediaPlayer.start();
            }
        });

        ImageButton imgSu = findViewById(R.id.imgSu);
        imgSu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.su);
                mediaPlayer.start();
            }
        });
        ImageButton su = findViewById(R.id.su);
        su.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.su);
                mediaPlayer.start();
            }
        });

        ImageButton imgSe = findViewById(R.id.imgSe);
        imgSe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.se);
                mediaPlayer.start();
            }
        });
        ImageButton se = findViewById(R.id.se);
        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.se);
                mediaPlayer.start();
            }
        });

        ImageButton imgSo = findViewById(R.id.imgSo);
        imgSo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.so);
                mediaPlayer.start();
            }
        });
        ImageButton so = findViewById(R.id.so);
        so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.so);
                mediaPlayer.start();
            }
        });

        ImageButton imgTa = findViewById(R.id.imgTa);
        imgTa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ta);
                mediaPlayer.start();
            }
        });
        ImageButton ta = findViewById(R.id.ta);
        ta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ta);
                mediaPlayer.start();
            }
        });

        ImageButton imgChi = findViewById(R.id.imgChi);
        imgChi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.chi);
                mediaPlayer.start();
            }
        });
        ImageButton chi = findViewById(R.id.chi);
        chi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.chi);
                mediaPlayer.start();
            }
        });

        ImageButton imgTsu = findViewById(R.id.imgTsu);
        imgTsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.tsu);
                mediaPlayer.start();
            }
        });
        ImageButton tsu = findViewById(R.id.tsu);
        tsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.tsu);
                mediaPlayer.start();
            }
        });

        ImageButton imgTe = findViewById(R.id.imgTe);
        imgTe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.te);
                mediaPlayer.start();
            }
        });
        ImageButton te = findViewById(R.id.te);
        te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.te);
                mediaPlayer.start();
            }
        });

        ImageButton imgTo = findViewById(R.id.imgTo);
        imgTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.to);
                mediaPlayer.start();
            }
        });
        ImageButton to = findViewById(R.id.to);
        to.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.to);
                mediaPlayer.start();
            }
        });

        ImageButton imgNa = findViewById(R.id.imgNa);
        imgNa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.na);
                mediaPlayer.start();
            }
        });
        ImageButton na = findViewById(R.id.na);
        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.na);
                mediaPlayer.start();
            }
        });

        ImageButton imgNi = findViewById(R.id.imgNi);
        imgNi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ni);
                mediaPlayer.start();
            }
        });
        ImageButton ni = findViewById(R.id.ni);
        ni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ni);
                mediaPlayer.start();
            }
        });

        ImageButton imgNu = findViewById(R.id.imgNu);
        imgNu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.nu);
                mediaPlayer.start();
            }
        });
        ImageButton nu = findViewById(R.id.nu);
        nu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.nu);
                mediaPlayer.start();
            }
        });

        ImageButton imgNe = findViewById(R.id.imgNe);
        imgNe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ne);
                mediaPlayer.start();
            }
        });
        ImageButton ne = findViewById(R.id.ne);
        ne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ne);
                mediaPlayer.start();
            }
        });

        ImageButton imgNo = findViewById(R.id.imgNo);
        imgNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.no);
                mediaPlayer.start();
            }
        });
        ImageButton no = findViewById(R.id.no);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.no);
                mediaPlayer.start();
            }
        });

        ImageButton imgHa = findViewById(R.id.imgHa);
        imgHa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ha);
                mediaPlayer.start();
            }
        });
        ImageButton ha = findViewById(R.id.ha);
        ha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ha);
                mediaPlayer.start();
            }
        });

        ImageButton imgHi = findViewById(R.id.imgHi);
        imgHi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.hi);
                mediaPlayer.start();
            }
        });
        ImageButton hi = findViewById(R.id.hi);
        hi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.hi);
                mediaPlayer.start();
            }
        });

        ImageButton imgFu = findViewById(R.id.imgFu);
        imgFu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.fu);
                mediaPlayer.start();
            }
        });
        ImageButton fu = findViewById(R.id.fu);
        fu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.fu);
                mediaPlayer.start();
            }
        });

        ImageButton imgHe = findViewById(R.id.imgHe);
        imgHe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.he);
                mediaPlayer.start();
            }
        });
        ImageButton he = findViewById(R.id.he);
        he.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.he);
                mediaPlayer.start();
            }
        });

        ImageButton imgHo = findViewById(R.id.imgHo);
        imgHo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ho);
                mediaPlayer.start();
            }
        });
        ImageButton ho = findViewById(R.id.ho);
        ho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ho);
                mediaPlayer.start();
            }
        });

        ImageButton imgMa = findViewById(R.id.imgMa);
        imgMa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ma);
                mediaPlayer.start();
            }
        });
        ImageButton ma = findViewById(R.id.ma);
        ma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ma);
                mediaPlayer.start();
            }
        });

        ImageButton imgMi = findViewById(R.id.imgMi);
        imgMi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mi);
                mediaPlayer.start();
            }
        });
        ImageButton mi = findViewById(R.id.mi);
        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mi);
                mediaPlayer.start();
            }
        });

        ImageButton imgMu = findViewById(R.id.imgMu);
        imgMu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mu);
                mediaPlayer.start();
            }
        });
        ImageButton mu = findViewById(R.id.mu);
        mu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mu);
                mediaPlayer.start();
            }
        });

        ImageButton imgMe = findViewById(R.id.imgMe);
        imgMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.me);
                mediaPlayer.start();
            }
        });
        ImageButton me = findViewById(R.id.me);
        me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.me);
                mediaPlayer.start();
            }
        });

        ImageButton imgMo = findViewById(R.id.imgMo);
        imgMo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mo);
                mediaPlayer.start();
            }
        });
        ImageButton mo = findViewById(R.id.mo);
        mo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.mo);
                mediaPlayer.start();
            }
        });

        ImageButton imgYa = findViewById(R.id.imgYa);
        imgYa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ya);
                mediaPlayer.start();
            }
        });
        ImageButton ya = findViewById(R.id.ya);
        ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ya);
                mediaPlayer.start();
            }
        });

        ImageButton imgYu = findViewById(R.id.imgYu);
        imgYu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.yu);
                mediaPlayer.start();
            }
        });
        ImageButton yu = findViewById(R.id.yu);
        yu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.yu);
                mediaPlayer.start();
            }
        });

        ImageButton imgYo = findViewById(R.id.imgYo);
        imgYo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.yo);
                mediaPlayer.start();
            }
        });
        ImageButton yo = findViewById(R.id.yo);
        yo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.yo);
                mediaPlayer.start();
            }
        });

        ImageButton imgRa = findViewById(R.id.imgRa);
        imgRa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ra);
                mediaPlayer.start();
            }
        });
        ImageButton ra = findViewById(R.id.ra);
        ra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ra);
                mediaPlayer.start();
            }
        });

        ImageButton imgRi = findViewById(R.id.imgRi);
        imgRi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ri);
                mediaPlayer.start();
            }
        });
        ImageButton ri = findViewById(R.id.ri);
        ri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ri);
                mediaPlayer.start();
            }
        });

        ImageButton imgRu = findViewById(R.id.imgRu);
        imgRu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ru);
                mediaPlayer.start();
            }
        });
        ImageButton ru = findViewById(R.id.ru);
        ru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ru);
                mediaPlayer.start();
            }
        });

        ImageButton imgRe = findViewById(R.id.imgRe);
        imgRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.re);
                mediaPlayer.start();
            }
        });
        ImageButton re = findViewById(R.id.re);
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.re);
                mediaPlayer.start();
            }
        });

        ImageButton imgRo = findViewById(R.id.imgRo);
        imgRo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ro);
                mediaPlayer.start();
            }
        });
        ImageButton ro = findViewById(R.id.ro);
        ro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.ro);
                mediaPlayer.start();
            }
        });

        ImageButton imgWa = findViewById(R.id.imgWa);
        imgWa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wa);
                mediaPlayer.start();
            }
        });
        ImageButton wa = findViewById(R.id.wa);
        wa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wa);
                mediaPlayer.start();
            }
        });

        ImageButton imgWo = findViewById(R.id.imgWo);
        imgWo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wo);
                mediaPlayer.start();
            }
        });
        ImageButton wo = findViewById(R.id.wo);
        wo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.wo);
                mediaPlayer.start();
            }
        });

        ImageButton imgN = findViewById(R.id.imgN);
        imgN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.n);
                mediaPlayer.start();
            }
        });
        ImageButton n = findViewById(R.id.n);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.n);
                mediaPlayer.start();
            }
        });

        TextView textHira = findViewById(R.id.textHira);
        TextView textKata = findViewById(R.id.textKata);

        ScrollView alphabetHira = findViewById(R.id.alphabeHira);
        ScrollView alphabetKata = findViewById(R.id.alphabetKata);

        Button btnNext = findViewById(R.id.btnNext);
        Button btnBack = findViewById(R.id.btnBack);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alphabetHira.animate().alpha(0).setDuration(2000);
                alphabetHira.setVisibility(GONE);

                alphabetKata.animate().alpha(1).setDuration(2000);
                alphabetKata.setVisibility(View.VISIBLE);


                textHira.animate().alpha(0).setDuration(1000);
                textKata.animate().alpha(1).setDuration(1000);

            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alphabetHira.animate().alpha(1).setDuration(2000);
                alphabetHira.setVisibility(View.VISIBLE);

                alphabetKata.animate().alpha(0).setDuration(2000);
                alphabetKata.setVisibility(GONE);

                textHira.animate().alpha(1).setDuration(1000);
                textKata.animate().alpha(0).setDuration(1000);
            }
        });
    }
}