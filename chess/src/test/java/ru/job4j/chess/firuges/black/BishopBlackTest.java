package ru.job4j.chess.firuges.black;

import junit.framework.TestCase;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import static org.hamcrest.Matchers.is;


import static org.junit.Assert.assertThat;

public class BishopBlackTest extends TestCase {

    public void testPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Cell position = bishopBlack.position();
        assertSame(position, Cell.C8);
    }

    public void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.way(Cell.G5), is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }

    public void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Figure bishopBlack2 = bishopBlack.copy(Cell.E5);
        Cell position = bishopBlack2.position();
        assertSame(position, Cell.E5);
    }
}