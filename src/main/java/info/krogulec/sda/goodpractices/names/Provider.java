package info.krogulec.sda.goodpractices.names;

import java.util.ArrayList;
import java.util.List;

/**
 * @author krogulecp
 */
//TODO Czy nazwy są tutaj odpowiednie? Co robi ta klasa?
class Provider {

    private List<Cell> gameBoard;

    public List<Cell> getFlaggedCells(){
        List<Cell> flaggedCells = new ArrayList<>();
        for(Cell cell : gameBoard){
            if(cell.isFlagged()){
                flaggedCells.add(cell);
            }
        }
        return flaggedCells;
    }
}
