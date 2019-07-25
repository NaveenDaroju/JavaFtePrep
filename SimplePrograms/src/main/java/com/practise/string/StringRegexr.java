/*
package com.practise.string;

import org.apache.commons.lang3.StringEscapeUtils;

public class StringRegexr {
    public static void main(String args[]) {
        // System.out.println(Pattern.matches("^[A-Za-z0-9- ,.#();:/<>\", ']+$", ",<>aru(),aa kahdf / <>#;:n32"));//true

        */
/*Map<String,String> tokens = new HashMap<String,String>();
        tokens.put("cat", "Garfield");
        tokens.put("beverage", "coffee");

        String template = "%cat% really needs some %beverage%.";

// Create pattern of the format "%(cat|beverage)%"
        String patternString = "%(" + StringUtils.join(tokens.keySet(), "|") + ")%";
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(template);

        StringBuffer sb = new StringBuffer();
        while(matcher.find()) {
            matcher.appendReplacement(sb, tokens.get(matcher.group(1)));
        }
        matcher.appendTail(sb);

        System.out.println(sb.toString());*//*



        String name = "<   kjhaskdfhklasjdfh >";
        System.out.println(name.replace("<,>","&lt;,&gt;"));
//.replace("<", "&lt;").replace(">", "&gt;")
        StringEscapeUtils.escapeHtml4(unEscapedString);
        // System.out.println(String.toBinaryString(i).replace("1", "one ").replace("0", "zero "));
        // String replace = convert.replace("1", "one ").replace("0", "zero ");


    }
}
*/
