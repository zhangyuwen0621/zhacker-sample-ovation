//   Copyright 2012,2013 Vaughn Vernon
//
//   Licensed under the Apache License, Version 2.0 (the "License");
//   you may not use this file except in compliance with the License.
//   You may obtain a copy of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
//   Unless required by applicable law or agreed to in writing, software
//   distributed under the License is distributed on an "AS IS" BASIS,
//   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   See the License for the specific language governing permissions and
//   limitations under the License.

package top.zhacker.ddd.collaboration.domain.calendar.event;

import lombok.Getter;
import top.zhacker.core.model.DomainEvent;
import top.zhacker.ddd.collaboration.domain.calendar.CalendarId;
import top.zhacker.ddd.collaboration.domain.calendar.CalendarSharer;
import top.zhacker.ddd.collaboration.domain.collaborator.Owner;
import top.zhacker.ddd.collaboration.domain.tenant.Tenant;

import java.util.Date;
import java.util.Set;

@Getter
public class CalendarCreated implements DomainEvent {

    private CalendarId calendarId;
    private String description;
    private int eventVersion;
    private String name;
    private Date occurredOn;
    private Owner owner;
    private Set<CalendarSharer> sharedWith;
    private Tenant tenant;

    public CalendarCreated(
            Tenant aTenant,
            CalendarId aCalendarId,
            String aName,
            String aDescription,
            Owner anOwner,
            Set<CalendarSharer> aSharedWith) {

        super();

        this.calendarId = aCalendarId;
        this.description = aDescription;
        this.eventVersion = 1;
        this.name = aName;
        this.occurredOn = new Date();
        this.owner = anOwner;
        this.sharedWith = aSharedWith;
        this.tenant = aTenant;
    }

    public CalendarId calendarId() {
        return this.calendarId;
    }

    public String description() {
        return this.description;
    }
    
    public int eventVersion() {
        return this.eventVersion;
    }

    public String name() {
        return this.name;
    }
    
    public Date occurredOn() {
        return this.occurredOn;
    }

    public Owner owner() {
        return this.owner;
    }

    public Set<CalendarSharer> sharedWith() {
        return this.sharedWith;
    }

    public Tenant tenant() {
        return this.tenant;
    }
}
