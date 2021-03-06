/*
 * Copyright 2011 ESW Software Engineering Group
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package pt.ist.processpedia.service.dto;

public class RequestDto extends Dto {

  private final String subject;
  private final String description;
  private final UserDto initiator;

  /**
   * Create a new Request DTO containing data about the request's id, title, description and the dto of its initiator
   * @param id The id of the request
   * @param subject The subject of the request
   * @param description The description of the request
   * @param initiator The User dto of the request initiator
   */
  public RequestDto(String id, String subject, String description, UserDto initiator) {
    super(id);
    this.initiator = initiator;
    this.subject = subject;
    this.description = description;
  }
  
  public String getSubject() {
    return this.subject;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public UserDto getInitiator() {
    return this.initiator;
  }

}