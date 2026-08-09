class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> checklist=new HashMap<>();
        checklist.put('{','}');
        checklist.put('[',']');
        checklist.put('(',')');
        Stack<Character> bank=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='{' || c=='[' || c=='('){
                bank.push(c);
            }else{
                if(bank.isEmpty() || c!=checklist.get(bank.pop())){
                    return false;
            }
            }

        }
        return bank.isEmpty();
        
    }
}
