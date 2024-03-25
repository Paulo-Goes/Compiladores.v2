/*import java.util.HashMap;
import java.util.Map;
public class AFD {
    private Map<State, Token.tipoToken> mapa;

    public AFD() {
        mapa = new HashMap<>();
        mapa.put(State.Q1, Token.tipoToken.ID);
        mapa.put(State.Q2, Token.tipoToken.NUM);
        mapa.put(State.Q3, Token.tipoToken.NUM_DEC);
        mapa.put(State.Q4, Token.tipoToken.TXT);
        mapa.put(State.Q5, Token.tipoToken.OPERADOR);
        mapa.put(State.Q6, Token.tipoToken.SIMBOLO_ESPECIAL);
        mapa.put(State.Q7, Token.tipoToken.COMENTARIO);
        mapa.put(State.Q8, Token.tipoToken.KEYWORD);
    }

    private State executeTransition(State currentState, char entry) {
        switch (currentState) {
            case INITIAL: {
                if ((entry >= 'A' && entry <= 'Z') || (entry >= 'a' && entry <= 'z'))
                    return State.Q1;
                else if (entry == '"')
                    return State.Q2;
                else if (entry >= '0' && entry <= '9')
                    return State.Q4;
                else if (entry == '+' || entry == '-')
                    return State.Q5;
                else
                    return State.ERRO;
            }

            case Q1: {
                return (entry >= 'A' && entry <= 'Z')
                        || (entry >= 'a' && entry <= 'z')
                        || (entry >= '0' && entry <= '9')
                        ? State.Q1 : State.ERRO;
            }

            case Q2: {
                return (entry == '"') ? State.Q3 : State.Q2;
            }

            case Q4: {
                if (entry == '.')
                    return State.Q6;
                else if (entry >= '0' && entry <= '9')
                    return State.Q4;
                else
                    return State.ERRO;
            }

            case Q5: {
                return (entry >= '0' && entry <= '9') ? State.Q4 : State.ERRO;
            }
            case Q6:

            case Q7: {
                return (entry >= '0' && entry <= '9') ? State.Q7 : State.ERRO;
            }

            default:
                return State.ERRO;
        }
    }

    public Token identificador(String str){
        State state = State.INITIAL;
        for(char c : str.toCharArray()){
            state = executeTransition(state, c);
        }
        return finalStates.getOrDefault(state, Token.INVALID);
    }
}
*/