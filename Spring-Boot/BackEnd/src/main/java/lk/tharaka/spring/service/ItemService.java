package lk.tharaka.spring.service;

import lk.tharaka.spring.dto.ItemDTO;

import java.util.ArrayList;

public interface ItemService {

    public boolean save(ItemDTO itemDTO);

    public boolean delete(int code);

    public ItemDTO getItem(int code);

    public ArrayList<ItemDTO>getAllItems();

}
