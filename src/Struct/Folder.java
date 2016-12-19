package Struct;

import java.util.Iterator;
import java.util.List;

/**
 * Created by finch on 2016/12/19.
 */
public class Folder extends Dir {

    public Folder(String fileName) {
        super(fileName);
    }

    @Override
    public List<Dir> getDirs() {
        return dirs;
    }

    @Override
    public void addDir(Dir dir) {
        dirs.add(dir);
    }

    @Override
    public void rmDir(Dir dir) {
        dirs.remove(dir);
    }

    @Override
    public void clear() {
        dirs.clear();
    }

    @Override
    public void print() {
        System.out.print(getFileName() + "(  ");

        Iterator<Dir> iter = dirs.iterator();

        while (iter.hasNext()) {
            Dir dir = iter.next();
            dir.print();

            if (iter.hasNext()) {
                System.out.print(",   ");
            }
        }
        System.out.print("  )");
    }
}
