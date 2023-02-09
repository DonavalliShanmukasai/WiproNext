   int len=str.length();
        String str1="";
        for(int i=len-1;i>=0;i--)
        {
            str1+=str.charAt(i);
        }
        if(str.equals(str1))
        return 2;
        else
        return 1;
    }
}
