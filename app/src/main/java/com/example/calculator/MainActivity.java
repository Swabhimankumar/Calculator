package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;
import java.util.Stack;

public class MainActivity extends Activity {

    private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bp,bc,bm,bmx,bd,be,bmod,blb,brb,bpow;
    private TextView rs;
    private EditText text;
    private String s="";
    private static Double v=0.0;
    private static int k=0;
    static Stack<Double> stk = new Stack<>();
    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=(Button)findViewById(R.id.b0);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        bc=(Button)findViewById(R.id.bc);
        bd=(Button)findViewById(R.id.bd);
        bm=(Button)findViewById(R.id.bm);
        bmx=(Button)findViewById(R.id.bmx);
        bp=(Button)findViewById(R.id.bp);
        bpow=(Button)findViewById(R.id.bpw);
        blb=(Button)findViewById(R.id.blb);
        brb=(Button)findViewById(R.id.brb);
        bmod=(Button)findViewById(R.id.bmod);
        be=(Button)findViewById(R.id.be);
        text=(EditText)findViewById(R.id.text);
        //rs=(TextView)findViewById(R.id.rs);
        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //text.setSelection(text.getText().length());

                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    v=0.0;
                    s="";
                }
                s+="%";

                text.setText(s);
                text.setSelection(text.getText().length());

            }
        });
        blb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //text.setSelection(text.getText().length());

                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    v=0.0;
                    s="";
                }
                s+="(";

                text.setText(s);
                text.setSelection(text.getText().length());

            }
        });
        brb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //text.setSelection(text.getText().length());

                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    v=0.0;
                    s="";
                }
                s+=")";

                text.setText(s);
                text.setSelection(text.getText().length());

            }
        });
        bpow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //text.setSelection(text.getText().length());

                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    v=0.0;
                    s="";
                }
                s+="^";

                text.setText(s);
                text.setSelection(text.getText().length());

            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //text.setSelection(text.getText().length());

                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    s="";
                    v=0.0;
                }
                s+="0";

                text.setText(s);
                text.setSelection(text.getText().length());

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setSelection(text.getText().length());
                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    v=0.0;
                    s="";
                }
                s+="1";
                text.setText(s);
                text.setSelection(text.getText().length());
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setSelection(text.getText().length());
                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    v=0.0;
                    s="";
                }
                s+="2";
                text.setText(s);
                text.setSelection(text.getText().length());
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    v=0.0;
                    s="";
                }
                s+="3";
                text.setText(s);
                text.setSelection(text.getText().length());
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    v=0.0;
                    s="";
                }
                s+="4";
                text.setText(s);
                text.setSelection(text.getText().length());
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    v=0.0;
                    s="";
                }
                s+="5";
                text.setText(s);
                text.setSelection(text.getText().length());
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    v=0.0;
                    s="";
                }
                s+="6";
                text.setText(s);
                text.setSelection(text.getText().length());
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    v=0.0;
                    s="";
                }
                s+="7";
                text.setText(s);
                text.setSelection(text.getText().length());
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    s="";
                }
                s+="8";
                text.setText(s);
                text.setSelection(text.getText().length());
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    v=0.0;
                    s="";
                }
                s+="9";
                text.setText(s);
                text.setSelection(text.getText().length());
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    v=0.0;
                    s="";
                }
                s+="+";
                text.setText(s);
                text.setSelection(text.getText().length());
            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    v=0.0;
                    s="";
                }
                s+="-";
                text.setText(s);
                text.setSelection(text.getText().length());
            }
        });
        bmx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    s="";
                }
                s+="*";
                text.setText(s);
                text.setSelection(text.getText().length());
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    v=0.0;
                    s="";
                }
                s+="/";
                text.setText(s);
                text.setSelection(text.getText().length());
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    v=0.0;
                    s="";
                }

                if(s.length()==2&&s.charAt(0)=='-'){
                    s="";
                }
                else if(s.length()!=0){
                    s = s.substring(0, s.length() - 1);
                }
                text.setText(s);
                text.setSelection(text.getText().length());
            }
        });
        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s=="Syntax Error"||s=="Inf"||v!=0.0){
                    v=0.0;
                    s="";
                    v=0.0;
                }
                else if(s.length()!=0){
                v=cal(s);
                }
                if(stk.size()!=0){
                    s="Syntax Error";
                }
               else if(s!="Syntax Error"&&k==0&&stk.size()==0){

                    s=String.valueOf(v);
               }
                else if(k==1){
                   s="Syntax Error";
               }
                //
                text.setText(s);
                text.setSelection(text.getText().length());
            }
        });






    }
    public static int val(char c){
        if(c=='+'||c=='-'){
            return 1;
        }
        if(c=='/'||c=='*'||c=='%'){
            return 2;
        }
        if(c=='^'){
            return 3;
        }
        return 0;
    }
    public static Double posev(String s){

        String sf=new String("");
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                sf+=s.charAt(i);
            }
            else if(s.charAt(i)==' '&&sf.length()!=0){
                Double d=Double.parseDouble(sf);
                stk.push(d);
                sf="";
            }
            else if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='/'||s.charAt(i)=='^'||s.charAt(i)=='*'||s.charAt(i)=='%'){
                if(stk.size()>1){
                    Double n1=stk.pop();
                    Double n2=stk.pop();
                    if(s.charAt(i)=='+'){
                        stk.push(n1+n2);
                    }
                    else if(s.charAt(i)=='-'){
                        stk.push(n2-n1);
                    }
                    else if(s.charAt(i)=='/'){
                        stk.push(n2/n1);
                    }
                    else if(s.charAt(i)=='^'){
                        stk.push(Math.pow(n2,n1));
                    }
                    else if(s.charAt(i)=='*'){
                        stk.push(n2*n1);
                    }
                    else if(s.charAt(i)=='%'){
                        stk.push(n2%n1);
                    }
                }
                else{
                    stk.push(2.0);
                    break;
                }

            }
        }
        Double fn=stk.peek();
        stk.pop();
        return fn;
    }
    public static Double cal(String s){

        Stack<Character> st = new Stack<>();
        String fs=new String("");
        int f=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                fs+=" ";
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                fs+=" ";
                while(!st.empty()&&st.peek()!='('){
                    fs+=st.peek();
                    st.pop();
                }
                fs+=" ";

                st.pop();
            }
            else if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='/'||s.charAt(i)=='^'||s.charAt(i)=='*'||s.charAt(i)=='%'){
                fs+=" ";
                if(i==s.length()-1){
                    f=1;
                    break;
                }
                if(i!=s.length()-1&&s.charAt(i)=='/'&&s.charAt(i+1)=='0'){
                    f=1;
                    break;
                }
                while(!st.empty()&&val(st.peek())>=val(s.charAt(i))){
                    fs+=st.peek();
                    st.pop();
                }
                fs+=" ";
                st.push(s.charAt(i));
            }
            else{
                fs+=s.charAt(i);
            }
        }
        fs+=" ";
        while(!st.empty()){
            fs+=st.peek();
            st.pop();
        }
        if(f==1){
            k=1;
            s="Syntax Error";
            return 2.0;
        }
        return posev(fs);

    }


}
