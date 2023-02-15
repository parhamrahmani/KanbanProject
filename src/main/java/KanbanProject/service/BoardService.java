package KanbanProject.service;

import KanbanProject.persistence.BoardEntity;
import KanbanProject.persistence.BoardRepository;
import KanbanProject.web.api.Board;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
private final BoardRepository boardRepository;
    private final BoardTransformer boardTransformer;

    public BoardService(BoardRepository boardRepository, BoardTransformer boardTransformer) {
        this.boardRepository = boardRepository;
        this.boardTransformer = boardTransformer;
    }

    public List<Board> findAll(){
        List<BoardEntity> boardEntities = boardRepository.findAll();
        return boardEntities.stream().map(boardTransformer::boardTransformer).toList();
    }

    public Board findById(long id){
        var boardEntity = boardRepository.findById(id);
        return boardEntity.stream().map(boardTransformer::boardTransformer).findFirst().orElse(null);
    }

    public Board createBoard(Board board){
        var boardEntity = new BoardEntity(board.getBoard_name(),board.getBoard_description(),board.getBoard_owner());
        boardEntity = boardRepository.save(boardEntity);
        return boardTransformer.boardTransformer(boardEntity);
    }


}


