class Bob {

    public String hey(String conversation) {
        
        conversation = conversation.trim();
        
        if (conversation.isEmpty() || conversation.isBlank()) {
            return "Fine. Be that way!";
        }
        
        int letterCounter = 0;
        int capitalCounter = 0;
        
        for (char letter : conversation.toCharArray()) {
            if (Character.isLetter(letter)) {
                if (Character.isUpperCase(letter)) {
                    capitalCounter++;
                }
                letterCounter++;
            }
        }
        
        boolean yelling;
        if (capitalCounter == letterCounter && capitalCounter != 0) {
            yelling = true;
        } else {
            yelling = false;
        }
        
        if (conversation.charAt(conversation.length() - 1) == '?') {
            if (yelling) {
                return "Calm down, I know what I'm doing!";
            }
            return "Sure.";
        }
        
        if (yelling) {
            return "Whoa, chill out!";
        }
        
        return "Whatever.";
    }
}