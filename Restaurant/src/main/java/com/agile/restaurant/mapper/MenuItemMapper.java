package com.agile.restaurant.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.agile.restaurant.dto.menuItem.MenuItemViewDto;
import com.agile.restaurant.model.MenuItem;

@Mapper()
public interface MenuItemMapper {
	
	MenuItemViewDto toViewDto(MenuItem menuItem);
	List<MenuItemViewDto> toViewDtos(List<MenuItem> menuItems);
}
